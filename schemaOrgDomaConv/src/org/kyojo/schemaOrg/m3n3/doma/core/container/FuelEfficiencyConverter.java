package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FUEL_EFFICIENCY;
import org.kyojo.schemaOrg.m3n3.core.Container.FuelEfficiency;

@ExternalDomain
public class FuelEfficiencyConverter implements DomainConverter<FuelEfficiency, String> {

	@Override
	public String fromDomainToValue(FuelEfficiency domain) {
		return domain.getNativeValue();
	}

	@Override
	public FuelEfficiency fromValueToDomain(String value) {
		return new FUEL_EFFICIENCY(value);
	}

}
