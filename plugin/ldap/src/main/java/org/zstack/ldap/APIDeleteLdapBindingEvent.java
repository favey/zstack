package org.zstack.ldap;

import org.zstack.header.message.APIEvent;
import org.zstack.header.rest.RestResponse;

@RestResponse
public class APIDeleteLdapBindingEvent extends APIEvent {
    public APIDeleteLdapBindingEvent(String apiId) {
        super(apiId);
    }

    public APIDeleteLdapBindingEvent() {
        super(null);
    }
}
