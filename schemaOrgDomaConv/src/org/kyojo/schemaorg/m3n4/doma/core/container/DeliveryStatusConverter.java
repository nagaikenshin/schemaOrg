package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DELIVERY_STATUS;
import org.kyojo.schemaorg.m3n4.core.Container.DeliveryStatus;

@ExternalDomain
public class DeliveryStatusConverter implements DomainConverter<DeliveryStatus, String> {

	@Override
	public String fromDomainToValue(DeliveryStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public DeliveryStatus fromValueToDomain(String value) {
		return new DELIVERY_STATUS(value);
	}

}