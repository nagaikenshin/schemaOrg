package org.kyojo.schemaOrg.m3n3.doma.core.reservationStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.reservationStatusType.RESERVATION_PENDING;
import org.kyojo.schemaOrg.m3n3.core.ReservationStatusType.ReservationPending;

@ExternalDomain
public class ReservationPendingConverter implements DomainConverter<ReservationPending, String> {

	@Override
	public String fromDomainToValue(ReservationPending domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReservationPending fromValueToDomain(String value) {
		return new RESERVATION_PENDING(value);
	}

}
