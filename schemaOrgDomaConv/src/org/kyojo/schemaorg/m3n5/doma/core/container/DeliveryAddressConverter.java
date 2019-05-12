package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DELIVERY_ADDRESS;
import org.kyojo.schemaorg.m3n5.core.Container.DeliveryAddress;

@ExternalDomain
public class DeliveryAddressConverter implements DomainConverter<DeliveryAddress, String> {

	@Override
	public String fromDomainToValue(DeliveryAddress domain) {
		return domain.getNativeValue();
	}

	@Override
	public DeliveryAddress fromValueToDomain(String value) {
		return new DELIVERY_ADDRESS(value);
	}

}
