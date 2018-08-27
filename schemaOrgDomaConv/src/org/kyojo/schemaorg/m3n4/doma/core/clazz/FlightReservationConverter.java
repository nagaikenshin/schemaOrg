package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FLIGHT_RESERVATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.FlightReservation;

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
