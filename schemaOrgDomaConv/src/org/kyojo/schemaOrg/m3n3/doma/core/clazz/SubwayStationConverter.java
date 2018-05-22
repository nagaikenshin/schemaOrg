package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUBWAY_STATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SubwayStation;

@ExternalDomain
public class SubwayStationConverter implements DomainConverter<SubwayStation, String> {

	@Override
	public String fromDomainToValue(SubwayStation domain) {
		return domain.getNativeValue();
	}

	@Override
	public SubwayStation fromValueToDomain(String value) {
		return new SUBWAY_STATION(value);
	}

}
