package org.zstack.header.vm

org.zstack.header.vm.APIGetVmConsoleAddressReply

doc {
    title "GetVmConsoleAddress"

    category "vmInstance"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/vm-instances/{uuid}/console-addresses"


            header (OAuth: 'the-session-uuid')

            clz APIGetVmConsoleAddressMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn ""
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc ""
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc ""
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIGetVmConsoleAddressReply.class
        }
    }
}