package org.zstack.network.service.lb

org.zstack.network.service.lb.APIAddVmNicToLoadBalancerEvent

doc {
    title "AddVmNicToLoadBalancer"

    category "loadBalancer"

    desc "在这里填写API描述"

    rest {
        request {
			url "POST /v1/load-balancers/listeners/{listenerUuid}/vm-instances/nics"


            header (OAuth: 'the-session-uuid')

            clz APIAddVmNicToLoadBalancerMsg.class

            desc ""
            
			params {

				column {
					name "vmNicUuids"
					enclosedIn "params"
					desc ""
					location "body"
					type "List"
					optional false
					since "0.6"
					
				}
				column {
					name "listenerUuid"
					enclosedIn "params"
					desc ""
					location "url"
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
            clz APIAddVmNicToLoadBalancerEvent.class
        }
    }
}