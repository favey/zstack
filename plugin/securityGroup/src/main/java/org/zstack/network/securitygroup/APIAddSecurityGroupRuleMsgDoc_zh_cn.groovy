package org.zstack.network.securitygroup

org.zstack.network.securitygroup.APIAddSecurityGroupRuleEvent

doc {
    title "AddSecurityGroupRule"

    category "securityGroup"

    desc "在这里填写API描述"

    rest {
        request {
			url "POST /v1/security-groups/{securityGroupUuid}/rules"


            header (OAuth: 'the-session-uuid')

            clz APIAddSecurityGroupRuleMsg.class

            desc ""
            
			params {

				column {
					name "securityGroupUuid"
					enclosedIn "params"
					desc "安全组UUID"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "rules"
					enclosedIn "params"
					desc ""
					location "body"
					type "List"
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
            clz APIAddSecurityGroupRuleEvent.class
        }
    }
}