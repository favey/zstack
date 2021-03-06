package org.zstack.network.service.eip

org.zstack.network.service.eip.APICreateEipEvent

doc {
    title "CreateEip"

    category "eip"

    desc "在这里填写API描述"

    rest {
        request {
			url "POST /v1/eips"


            header (OAuth: 'the-session-uuid')

            clz APICreateEipMsg.class

            desc ""
            
			params {

				column {
					name "name"
					enclosedIn "params"
					desc "资源名称"
					location "body"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "description"
					enclosedIn "params"
					desc "资源的详细描述"
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "vipUuid"
					enclosedIn "params"
					desc "VIP UUID"
					location "body"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "vmNicUuid"
					enclosedIn "params"
					desc "云主机网卡UUID"
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "resourceUuid"
					enclosedIn "params"
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
            clz APICreateEipEvent.class
        }
    }
}