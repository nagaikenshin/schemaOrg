package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CITY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.City;

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
