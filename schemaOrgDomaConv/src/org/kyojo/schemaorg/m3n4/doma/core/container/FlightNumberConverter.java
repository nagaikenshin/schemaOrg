package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FLIGHT_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.FlightNumber;

@ExternalDomain
public class FlightNumberConverter implements DomainConverter<FlightNumber, String> {

	@Override
	public String fromDomainToValue(FlightNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public FlightNumber fromValueToDomain(String value) {
		return new FLIGHT_NUMBER(value);
	}

}
