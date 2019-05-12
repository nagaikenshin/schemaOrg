package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SUB_RESERVATION;
import org.kyojo.schemaorg.m3n5.core.Container.SubReservation;

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
