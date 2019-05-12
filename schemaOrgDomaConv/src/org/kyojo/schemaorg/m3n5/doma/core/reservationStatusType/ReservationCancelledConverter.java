package org.kyojo.schemaorg.m3n5.doma.core.reservationStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.reservationStatusType.RESERVATION_CANCELLED;
import org.kyojo.schemaorg.m3n5.core.ReservationStatusType.ReservationCancelled;

@ExternalDomain
public class ReservationCancelledConverter implements DomainConverter<ReservationCancelled, String> {

	@Override
	public String fromDomainToValue(ReservationCancelled domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReservationCancelled fromValueToDomain(String value) {
		return new RESERVATION_CANCELLED(value);
	}

}
