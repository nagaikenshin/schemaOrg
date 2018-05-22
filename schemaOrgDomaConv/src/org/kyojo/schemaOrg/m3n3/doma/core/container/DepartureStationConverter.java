package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPARTURE_STATION;
import org.kyojo.schemaOrg.m3n3.core.Container.DepartureStation;

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
