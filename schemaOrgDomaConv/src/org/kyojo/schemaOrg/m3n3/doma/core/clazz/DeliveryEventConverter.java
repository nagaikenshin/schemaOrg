package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DELIVERY_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DeliveryEvent;

@ExternalDomain
public class DeliveryEventConverter implements DomainConverter<DeliveryEvent, String> {

	@Override
	public String fromDomainToValue(DeliveryEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public DeliveryEvent fromValueToDomain(String value) {
		return new DELIVERY_EVENT(value);
	}

}
