package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LODGING_RESERVATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LodgingReservation;

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
