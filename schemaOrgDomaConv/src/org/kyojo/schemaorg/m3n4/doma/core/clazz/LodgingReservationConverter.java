package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LODGING_RESERVATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.LodgingReservation;

@ExternalDomain
public class LodgingReservationConverter implements DomainConverter<LodgingReservation, String> {

	@Override
	public String fromDomainToValue(LodgingReservation domain) {
		return domain.getNativeValue();
	}

	@Override
	public LodgingReservation fromValueToDomain(String value) {
		return new LODGING_RESERVATION(value);
	}

}
