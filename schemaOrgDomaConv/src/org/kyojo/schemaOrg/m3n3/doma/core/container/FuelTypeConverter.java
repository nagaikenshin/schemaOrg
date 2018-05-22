package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FUEL_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.FuelType;

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
