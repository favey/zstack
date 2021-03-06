package org.zstack.header.network.service

org.zstack.header.network.service.APIQueryNetworkServiceProviderReply
import org.zstack.header.query.APIQueryMessage

doc {
    title "QueryNetworkServiceProvider"

    category "network.service"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/network-services/providers"


            header (OAuth: 'the-session-uuid')

            clz APIQueryNetworkServiceProviderMsg.class

            desc ""
            
			params APIQueryMessage.class
        }

        response {
            clz APIQueryNetworkServiceProviderReply.class
        }
    }
}