package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPARTURE_AIRPORT;
import org.kyojo.schemaOrg.m3n3.core.Container.DepartureAirport;

@ExternalDomain
public class DepartureAirportConverter implements DomainConverter<DepartureAirport, String> {

	@Override
	public String fromDomainToValue(DepartureAirport domain) {
		return domain.getNativeValue();
	}

	@Override
	public DepartureAirport fromValueToDomain(String value) {
		return new DEPARTURE_AIRPORT(value);
	}

}
