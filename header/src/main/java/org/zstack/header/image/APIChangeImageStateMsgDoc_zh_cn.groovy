package org.zstack.header.image

org.zstack.header.image.APIChangeImageStateEvent

doc {
    title "ChangeImageState"

    category "image"

    desc "在这里填写API描述"

    rest {
        request {
			url "PUT /v1/images/{uuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APIChangeImageStateMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "params"
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "stateEvent"
					enclosedIn "params"
					desc ""
					location "body"
					type "String"
					optional false
					since "0.6"
					values ("enable","disable")
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
            clz APIChangeImageStateEvent.class
        }
    }
}