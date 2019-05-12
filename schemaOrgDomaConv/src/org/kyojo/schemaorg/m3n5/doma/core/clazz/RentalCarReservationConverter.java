package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RENTAL_CAR_RESERVATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.RentalCarReservation;

@ExternalDomain
public class RentalCarReservationConverter implements DomainConverter<RentalCarReservation, String> {

	@Override
	public String fromDomainToValue(RentalCarReservation domain) {
		return domain.getNativeValue();
	}

	@Override
	public RentalCarReservation fromValueToDomain(String value) {
		return new RENTAL_CAR_RESERVATION(value);
	}

}
