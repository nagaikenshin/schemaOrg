package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SUBSCRIBE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.SubscribeAction;

@ExternalDomain
public class SubscribeActionConverter implements DomainConverter<SubscribeAction, String> {

	@Override
	public String fromDomainToValue(SubscribeAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public SubscribeAction fromValueToDomain(String value) {
		return new SUBSCRIBE_ACTION(value);
	}

}
