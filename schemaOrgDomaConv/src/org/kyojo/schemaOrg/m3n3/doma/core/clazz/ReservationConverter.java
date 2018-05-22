package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESERVATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Reservation;

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
