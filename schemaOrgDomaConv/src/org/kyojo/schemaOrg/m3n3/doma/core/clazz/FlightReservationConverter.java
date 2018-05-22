package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FLIGHT_RESERVATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.FlightReservation;

@ExternalDomain
public class FlightReservationConverter implements DomainConverter<FlightReservation, String> {

	@Override
	public String fromDomainToValue(FlightReservation domain) {
		return domain.getNativeValue();
	}

	@Override
	public FlightReservation fromValueToDomain(String value) {
		return new FLIGHT_RESERVATION(value);
	}

}
