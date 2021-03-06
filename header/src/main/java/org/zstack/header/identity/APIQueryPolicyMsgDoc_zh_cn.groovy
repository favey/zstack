package org.zstack.header.identity

org.zstack.header.identity.APIQueryPolicyReply
import org.zstack.header.query.APIQueryMessage

doc {
    title "QueryPolicy"

    category "identity"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/accounts/policies"

			url "GET /v1/accounts/policies/{uuid}"


            header (OAuth: 'the-session-uuid')

            clz APIQueryPolicyMsg.class

            desc ""
            
			params APIQueryMessage.class
        }

        response {
            clz APIQueryPolicyReply.class
        }
    }
}