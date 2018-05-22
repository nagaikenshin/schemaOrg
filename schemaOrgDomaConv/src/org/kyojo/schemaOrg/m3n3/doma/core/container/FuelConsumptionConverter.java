package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FUEL_CONSUMPTION;
import org.kyojo.schemaOrg.m3n3.core.Container.FuelConsumption;

@ExternalDomain
public class FuelConsumptionConverter implements DomainConverter<FuelConsumption, String> {

	@Override
	public String fromDomainToValue(FuelConsumption domain) {
		return domain.getNativeValue();
	}

	@Override
	public FuelConsumption fromValueToDomain(String value) {
		return new FUEL_CONSUMPTION(value);
	}

}
