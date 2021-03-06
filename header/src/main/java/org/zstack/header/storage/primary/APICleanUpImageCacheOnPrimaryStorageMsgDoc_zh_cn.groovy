package org.zstack.header.storage.primary

org.zstack.header.storage.primary.APICleanUpImageCacheOnPrimaryStorageEvent

doc {
    title "CleanUpImageCacheOnPrimaryStorage"

    category "storage.primary"

    desc "在这里填写API描述"

    rest {
        request {
			url "PUT /v1/primary-storage/{uuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APICleanUpImageCacheOnPrimaryStorageMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "cleanUpImageCacheOnPrimaryStorage"
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
            clz APICleanUpImageCacheOnPrimaryStorageEvent.class
        }
    }
}