package org.kyojo.schemaOrg.m3n3.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.impl.FUEL_CAPACITY;
import org.kyojo.schemaOrg.m3n3.auto.Container.FuelCapacity;

@ExternalDomain
public class FuelCapacityConverter implements DomainConverter<FuelCapacity, String> {

	@Override
	public String fromDomainToValue(FuelCapacity domain) {
		return domain.getNativeValue();
	}

	@Override
	public FuelCapacity fromValueToDomain(String value) {
		return new FUEL_CAPACITY(value);
	}

}
