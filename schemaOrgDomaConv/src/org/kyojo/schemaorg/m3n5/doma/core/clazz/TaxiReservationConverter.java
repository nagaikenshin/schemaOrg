package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TAXI_RESERVATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.TaxiReservation;

@ExternalDomain
public class TaxiReservationConverter implements DomainConverter<TaxiReservation, String> {

	@Override
	public String fromDomainToValue(TaxiReservation domain) {
		return domain.getNativeValue();
	}

	@Override
	public TaxiReservation fromValueToDomain(String value) {
		return new TAXI_RESERVATION(value);
	}

}