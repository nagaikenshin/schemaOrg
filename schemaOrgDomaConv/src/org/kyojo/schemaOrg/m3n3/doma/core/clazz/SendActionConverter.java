package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SEND_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SendAction;

@ExternalDomain
public class SendActionConverter implements DomainConverter<SendAction, String> {

	@Override
	public String fromDomainToValue(SendAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public SendAction fromValueToDomain(String value) {
		return new SEND_ACTION(value);
	}

}
