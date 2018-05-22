package org.kyojo.schemaOrg.m3n3.doma.auto.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.impl.CAR_USAGE_TYPE;
import org.kyojo.schemaOrg.m3n3.auto.Clazz.CarUsageType;

@ExternalDomain
public class CarUsageTypeConverter implements DomainConverter<CarUsageType, String> {

	@Override
	public String fromDomainToValue(CarUsageType domain) {
		return domain.getNativeValue();
	}

	@Override
	public CarUsageType fromValueToDomain(String value) {
		return new CAR_USAGE_TYPE(value);
	}

}
