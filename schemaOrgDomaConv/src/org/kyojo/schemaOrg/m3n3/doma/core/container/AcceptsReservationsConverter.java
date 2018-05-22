package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCEPTS_RESERVATIONS;
import org.kyojo.schemaOrg.m3n3.core.Container.AcceptsReservations;

@ExternalDomain
public class AcceptsReservationsConverter implements DomainConverter<AcceptsReservations, String> {

	@Override
	public String fromDomainToValue(AcceptsReservations domain) {
		return domain.getNativeValue();
	}

	@Override
	public AcceptsReservations fromValueToDomain(String value) {
		return new ACCEPTS_RESERVATIONS(value);
	}

}
