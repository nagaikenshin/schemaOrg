package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SEND_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.SendAction;

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
