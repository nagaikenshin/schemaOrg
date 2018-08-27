package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CAR;
import org.kyojo.schemaorg.m3n4.core.Clazz.Car;

@ExternalDomain
public class CarConverter implements DomainConverter<Car, String> {

	@Override
	public String fromDomainToValue(Car domain) {
		return domain.getNativeValue();
	}

	@Override
	public Car fromValueToDomain(String value) {
		return new CAR(value);
	}

}
