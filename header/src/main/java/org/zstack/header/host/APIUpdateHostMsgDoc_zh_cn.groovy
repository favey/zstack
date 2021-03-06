package org.zstack.header.host

org.zstack.header.host.APIUpdateHostEvent

doc {
    title "UpdateHost"

    category "host"

    desc "在这里填写API描述"

    rest {
        request {
			url "PUT /v1/hosts/{uuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APIUpdateHostMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "updateHost"
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "name"
					enclosedIn "updateHost"
					desc "资源名称"
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "description"
					enclosedIn "updateHost"
					desc "资源的详细描述"
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "managementIp"
					enclosedIn "updateHost"
					desc ""
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc ""
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc ""
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIUpdateHostEvent.class
        }
    }
}