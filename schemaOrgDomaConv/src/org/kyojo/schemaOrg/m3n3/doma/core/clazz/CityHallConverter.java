package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CITY_HALL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CityHall;

@ExternalDomain
public class CityHallConverter implements DomainConverter<CityHall, String> {

	@Override
	public String fromDomainToValue(CityHall domain) {
		return domain.getNativeValue();
	}

	@Override
	public CityHall fromValueToDomain(String value) {
		return new CITY_HALL(value);
	}

}
