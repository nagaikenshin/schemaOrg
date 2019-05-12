package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CITY;
import org.kyojo.schemaorg.m3n5.core.Clazz.City;

@ExternalDomain
public class CityConverter implements DomainConverter<City, String> {

	@Override
	public String fromDomainToValue(City domain) {
		return domain.getNativeValue();
	}

	@Override
	public City fromValueToDomain(String value) {
		return new CITY(value);
	}

}
