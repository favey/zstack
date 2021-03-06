package org.zstack.header.network.l3

org.zstack.header.network.l3.APIQueryL3NetworkReply
import org.zstack.header.query.APIQueryMessage

doc {
    title "QueryL3Network"

    category "network.l3"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/l3-networks"

			url "GET /v1/l3-networks/{uuid}"


            header (OAuth: 'the-session-uuid')

            clz APIQueryL3NetworkMsg.class

            desc ""
            
			params APIQueryMessage.class
        }

        response {
            clz APIQueryL3NetworkReply.class
        }
    }
}