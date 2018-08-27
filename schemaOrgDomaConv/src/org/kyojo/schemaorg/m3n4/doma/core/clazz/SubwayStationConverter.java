package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SUBWAY_STATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.SubwayStation;

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
