package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CITY_HALL;
import org.kyojo.schemaorg.m3n5.core.Clazz.CityHall;

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