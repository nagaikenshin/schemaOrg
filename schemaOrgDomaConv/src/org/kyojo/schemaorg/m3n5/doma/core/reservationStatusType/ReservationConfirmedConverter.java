package org.kyojo.schemaorg.m3n5.doma.core.reservationStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.reservationStatusType.RESERVATION_CONFIRMED;
import org.kyojo.schemaorg.m3n5.core.ReservationStatusType.ReservationConfirmed;

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
