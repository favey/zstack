package org.zstack.header.storage.primary

org.zstack.header.storage.primary.APIDeletePrimaryStorageEvent

doc {
    title "DeletePrimaryStorage"

    category "storage.primary"

    desc "在这里填写API描述"

    rest {
        request {
			url "DELETE /v1/primary-storage/{uuid}"


            header (OAuth: 'the-session-uuid')

            clz APIDeletePrimaryStorageMsg.class

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
					name "deleteMode"
					enclosedIn ""
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
            clz APIDeletePrimaryStorageEvent.class
        }
    }
}