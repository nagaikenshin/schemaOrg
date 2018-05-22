package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PARCEL_DELIVERY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ParcelDelivery;

@ExternalDomain
public class ParcelDeliveryConverter implements DomainConverter<ParcelDelivery, String> {

	@Override
	public String fromDomainToValue(ParcelDelivery domain) {
		return domain.getNativeValue();
	}

	@Override
	public ParcelDelivery fromValueToDomain(String value) {
		return new PARCEL_DELIVERY(value);
	}

}
