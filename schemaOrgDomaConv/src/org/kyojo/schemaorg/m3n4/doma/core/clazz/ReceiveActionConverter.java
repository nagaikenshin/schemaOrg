package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RECEIVE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReceiveAction;

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
