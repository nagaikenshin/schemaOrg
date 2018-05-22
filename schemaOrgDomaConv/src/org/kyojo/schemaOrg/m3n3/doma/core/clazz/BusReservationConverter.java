package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BUS_RESERVATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BusReservation;

@ExternalDomain
public class BusReservationConverter implements DomainConverter<BusReservation, String> {

	@Override
	public String fromDomainToValue(BusReservation domain) {
		return domain.getNativeValue();
	}

	@Override
	public BusReservation fromValueToDomain(String value) {
		return new BUS_RESERVATION(value);
	}

}
