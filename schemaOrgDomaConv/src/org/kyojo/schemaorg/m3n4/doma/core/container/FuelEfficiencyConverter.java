package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FUEL_EFFICIENCY;
import org.kyojo.schemaorg.m3n4.core.Container.FuelEfficiency;

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
