package org.zstack.core.encrypt;

import org.dom4j.io.STAXEventReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.zstack.core.Platform;
import org.zstack.core.cloudbus.CloudBus;
import org.zstack.core.db.DatabaseFacade;
import org.zstack.header.AbstractService;
import org.zstack.header.core.encrypt.APIUpdateEncryptKeyEvent;
import org.zstack.header.core.encrypt.APIUpdateEncryptKeyMsg;
import org.zstack.header.core.encrypt.ENCRYPT;
import org.zstack.header.core.encrypt.ENCRYPTParam;
import org.zstack.header.message.Message;
import org.zstack.header.volume.VolumeType;
import org.zstack.utils.Utils;
import org.zstack.utils.logging.CLogger;

import javax.persistence.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Created by mingjian.deng on 16/12/28.
 */
public class EncryptManagerImpl extends AbstractService {
    private static final CLogger logger = Utils.getLogger(EncryptManagerImpl.class);
    @Autowired
    private CloudBus bus;

    @Autowired
    private DatabaseFacade dbf;

    @Override
    public boolean start() {
        return true;
    }

    @Override
    public boolean stop() {
        return true;
    }

    @Override
    public void handleMessage(Message msg) {
        if (msg instanceof APIUpdateEncryptKeyMsg) {
            handle((APIUpdateEncryptKeyMsg) msg);
        } else {
            bus.dealWithUnknownMessage(msg);
        }
    }

    private void handle(APIUpdateEncryptKeyMsg msg){
        Set<Method> map = Platform.encryptedMethodsMap;
        logger.debug("decrypt passwords with old key and encrypt with new key");
        for (Method method: map) {
            String old_key = EncryptGlobalConfig.ENCRYPT_ALGORITHM.value();
            String new_key = msg.getEncryptKey();

            Class tempClass = method.getDeclaringClass();
            String className = tempClass.getSimpleName();
            //String paramName = method.getParameters()[0].getName();
            String paramName = "password";

            logger.debug(String.format("className is : %s",className));
            logger.debug(String.format("paramName is: %s ",paramName));


            //Class<?> classType = tempClass.

            //List<Object> tablelist = dbf.listAll(tempClass);
            /*Field field = method.getParameters();
            String old_value =*/
            EncryptRSA rsa = new EncryptRSA();

            String sql1 = "select uuid from "+className;
            logger.debug(String.format("sql1 is: %s ",sql1));
            Query q1 = dbf.getEntityManager().createNativeQuery(sql1);
            List uuidList = q1.getResultList();

            for (int i=0; i<uuidList.size(); i++){
                String sql2 = "select "+paramName+" from "+className+" where uuid = \""+uuidList.get(i)+"\"";
                logger.debug(String.format("sql2 is: %s ",sql2));
                Query q2 = dbf.getEntityManager().createNativeQuery(sql2);
                String preEncrypttxt = q2.getResultList().get(0).toString();
                logger.debug(String.format("preEncrypttxt is: %s ",preEncrypttxt));
                try {

                    String password = (String) rsa.decrypt1(preEncrypttxt);
                    rsa.updateKey(msg.getEncryptKey());
                    String newencrypttxt = (String) rsa.encrypt1(password);

                    String sql3 = "update "+className+" set "+paramName+" = "+newencrypttxt+" where uuid = \""+uuidList.get(i)+"\"";
                    Query query = dbf.getEntityManager().createQuery(sql3);
                    query.executeUpdate();

                }catch (Exception e){
                    logger.debug(e.getStackTrace().toString());
                }

            }





            //String sql2 = "update "+className+" set "+paramName+" = "+ rsa.encrypt1()
            //q.setParameter("param", paramName);



            /*for (int i=0; i<aa.size(); i++){
                logger.debug(String.format("result i is : %s, %s",((EncryptParam)aa.get(i)).getUuid(),((EncryptParam)aa.get(i)).getPassword())); ;
            }*/



            /*String sql = "update "+className+" set vol.vmInstanceUuid = null where vol.uuid in (:uuids)";
            Query q = dbf.getEntityManager().createQuery(sql);
            q.setParameter("uuids", dataVolumeUuids);
            q.executeUpdate();*/


            //String old_value = dbf.createQuery();

            APIUpdateEncryptKeyEvent evt = new APIUpdateEncryptKeyEvent();
            bus.publish(evt);
        }
    }

    @Override
    public String getId() {
        return bus.makeLocalServiceId(EncryptGlobalConfig.SERVICE_ID);
    }
}