package org.kyojo.schemaOrg.m3n3.doma.core.reservationStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.reservationStatusType.RESERVATION_CONFIRMED;
import org.kyojo.schemaOrg.m3n3.core.ReservationStatusType.ReservationConfirmed;

@ExternalDomain
public class ReservationConfirmedConverter implements DomainConverter<ReservationConfirmed, String> {

	@Override
	public String fromDomainToValue(ReservationConfirmed domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReservationConfirmed fromValueToDomain(String value) {
		return new RESERVATION_CONFIRMED(value);
	}

}
