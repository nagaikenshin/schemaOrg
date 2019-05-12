package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DEPARTURE_STATION;
import org.kyojo.schemaorg.m3n5.core.Container.DepartureStation;

@ExternalDomain
public class DepartureStationConverter implements DomainConverter<DepartureStation, String> {

	@Override
	public String fromDomainToValue(DepartureStation domain) {
		return domain.getNativeValue();
	}

	@Override
	public DepartureStation fromValueToDomain(String value) {
		return new DEPARTURE_STATION(value);
	}

}
