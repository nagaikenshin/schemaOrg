package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CARRIER_REQUIREMENTS;
import org.kyojo.schemaorg.m3n5.core.Container.CarrierRequirements;

@ExternalDomain
public class CarrierRequirementsConverter implements DomainConverter<CarrierRequirements, String> {

	@Override
	public String fromDomainToValue(CarrierRequirements domain) {
		return domain.getNativeValue();
	}

	@Override
	public CarrierRequirements fromValueToDomain(String value) {
		return new CARRIER_REQUIREMENTS(value);
	}

}
