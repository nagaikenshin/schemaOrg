package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUB_RESERVATION;
import org.kyojo.schemaOrg.m3n3.core.Container.SubReservation;

@ExternalDomain
public class SubReservationConverter implements DomainConverter<SubReservation, String> {

	@Override
	public String fromDomainToValue(SubReservation domain) {
		return domain.getNativeValue();
	}

	@Override
	public SubReservation fromValueToDomain(String value) {
		return new SUB_RESERVATION(value);
	}

}
