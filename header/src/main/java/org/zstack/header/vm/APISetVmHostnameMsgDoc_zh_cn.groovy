package org.zstack.header.vm

org.zstack.header.vm.APISetVmHostnameEvent

doc {
    title "SetVmHostname"

    category "vmInstance"

    desc "在这里填写API描述"

    rest {
        request {
			url "PUT /v1/vm-instances/{uuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APISetVmHostnameMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "setVmHostname"
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "hostname"
					enclosedIn "setVmHostname"
					desc ""
					location "body"
					type "String"
					optional false
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
            clz APISetVmHostnameEvent.class
        }
    }
}