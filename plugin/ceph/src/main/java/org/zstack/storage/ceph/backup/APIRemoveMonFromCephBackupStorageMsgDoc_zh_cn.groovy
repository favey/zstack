package org.zstack.storage.ceph.backup

org.zstack.storage.ceph.backup.APIRemoveMonFromCephBackupStorageEvent

doc {
    title "RemoveMonFromCephBackupStorage"

    category "未知类别"

    desc "在这里填写API描述"

    rest {
        request {
			url "DELETE /v1/backup-storage/ceph/{uuid}/mons"


            header (OAuth: 'the-session-uuid')

            clz APIRemoveMonFromCephBackupStorageMsg.class

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
					name "monHostnames"
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
            clz APIRemoveMonFromCephBackupStorageEvent.class
        }
    }
}