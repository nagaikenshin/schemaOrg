package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RECEIVE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ReceiveAction;

@ExternalDomain
public class ReceiveActionConverter implements DomainConverter<ReceiveAction, String> {

	@Override
	public String fromDomainToValue(ReceiveAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReceiveAction fromValueToDomain(String value) {
		return new RECEIVE_ACTION(value);
	}

}
