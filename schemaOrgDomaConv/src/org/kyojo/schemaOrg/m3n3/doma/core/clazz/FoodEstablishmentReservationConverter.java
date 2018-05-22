package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FOOD_ESTABLISHMENT_RESERVATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.FoodEstablishmentReservation;

@ExternalDomain
public class FoodEstablishmentReservationConverter implements DomainConverter<FoodEstablishmentReservation, String> {

	@Override
	public String fromDomainToValue(FoodEstablishmentReservation domain) {
		return domain.getNativeValue();
	}

	@Override
	public FoodEstablishmentReservation fromValueToDomain(String value) {
		return new FOOD_ESTABLISHMENT_RESERVATION(value);
	}

}
