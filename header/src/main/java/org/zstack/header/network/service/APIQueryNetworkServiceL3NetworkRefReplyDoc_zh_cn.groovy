package org.zstack.header.network.service

import org.zstack.header.errorcode.ErrorCode
import org.zstack.header.network.service.NetworkServiceL3NetworkRefInventory

doc {

	title "在这里输入结构的名称"

	ref {
		name "error"
		path "org.zstack.header.network.service.APIQueryNetworkServiceL3NetworkRefReply.error"
		desc "错误码，若不为null，则表示操作失败, 操作成功时该字段为null",false
		type "ErrorCode"
		since "0.6"
		clz ErrorCode.class
	}
	ref {
		name "inventories"
		path "org.zstack.header.network.service.APIQueryNetworkServiceL3NetworkRefReply.inventories"
		desc "null"
		type "List"
		since "0.6"
		clz NetworkServiceL3NetworkRefInventory.class
	}
}
