package org.zstack.header.storage.primary

org.zstack.header.storage.primary.APIQueryPrimaryStorageReply
import org.zstack.header.query.APIQueryMessage

doc {
    title "QueryPrimaryStorage"

    category "storage.primary"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/primary-storage"


            header (OAuth: 'the-session-uuid')

            clz APIQueryPrimaryStorageMsg.class

            desc ""
            
			params APIQueryMessage.class
        }

        response {
            clz APIQueryPrimaryStorageReply.class
        }
    }
}