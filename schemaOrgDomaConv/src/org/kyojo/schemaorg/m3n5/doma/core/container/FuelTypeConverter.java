package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FUEL_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.FuelType;

@ExternalDomain
public class FuelTypeConverter implements DomainConverter<FuelType, String> {

	@Override
	public String fromDomainToValue(FuelType domain) {
		return domain.getNativeValue();
	}

	@Override
	public FuelType fromValueToDomain(String value) {
		return new FUEL_TYPE(value);
	}

}