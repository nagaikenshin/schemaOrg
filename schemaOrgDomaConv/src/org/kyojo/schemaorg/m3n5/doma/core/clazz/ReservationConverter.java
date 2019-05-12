package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RESERVATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.Reservation;

@ExternalDomain
public class ReservationConverter implements DomainConverter<Reservation, String> {

	@Override
	public String fromDomainToValue(Reservation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Reservation fromValueToDomain(String value) {
		return new RESERVATION(value);
	}

}
