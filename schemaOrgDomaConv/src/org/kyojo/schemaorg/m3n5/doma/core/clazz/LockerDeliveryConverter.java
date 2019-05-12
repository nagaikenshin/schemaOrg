package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LOCKER_DELIVERY;
import org.kyojo.schemaorg.m3n5.core.Clazz.LockerDelivery;

@ExternalDomain
public class LockerDeliveryConverter implements DomainConverter<LockerDelivery, String> {

	@Override
	public String fromDomainToValue(LockerDelivery domain) {
		return domain.getNativeValue();
	}

	@Override
	public LockerDelivery fromValueToDomain(String value) {
		return new LOCKER_DELIVERY(value);
	}

}
