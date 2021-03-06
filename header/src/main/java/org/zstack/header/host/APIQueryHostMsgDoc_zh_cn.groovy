package org.zstack.header.host

org.zstack.header.host.APIQueryHostReply
import org.zstack.header.query.APIQueryMessage

doc {
    title "QueryHost"

    category "host"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/hosts"

			url "GET /v1/hosts/{uuid}"


            header (OAuth: 'the-session-uuid')

            clz APIQueryHostMsg.class

            desc ""
            
			params APIQueryMessage.class
        }

        response {
            clz APIQueryHostReply.class
        }
    }
}