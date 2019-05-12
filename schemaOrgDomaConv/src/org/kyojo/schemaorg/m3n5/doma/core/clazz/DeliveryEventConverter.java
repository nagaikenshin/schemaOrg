package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DELIVERY_EVENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.DeliveryEvent;

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
