package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EVENT_RESERVATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EventReservation;

@ExternalDomain
public class EventReservationConverter implements DomainConverter<EventReservation, String> {

	@Override
	public String fromDomainToValue(EventReservation domain) {
		return domain.getNativeValue();
	}

	@Override
	public EventReservation fromValueToDomain(String value) {
		return new EVENT_RESERVATION(value);
	}

}
