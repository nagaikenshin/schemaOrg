package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RENTAL_CAR_RESERVATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RentalCarReservation;

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
