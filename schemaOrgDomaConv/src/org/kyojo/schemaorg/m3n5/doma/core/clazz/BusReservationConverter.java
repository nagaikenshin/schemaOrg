package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BUS_RESERVATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.BusReservation;

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
