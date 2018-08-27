package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FUEL_CONSUMPTION;
import org.kyojo.schemaorg.m3n4.core.Container.FuelConsumption;

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
