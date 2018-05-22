package org.kyojo.schemaOrg.m3n3.doma.core.reservationStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.reservationStatusType.RESERVATION_HOLD;
import org.kyojo.schemaOrg.m3n3.core.ReservationStatusType.ReservationHold;

@ExternalDomain
public class ReservationHoldConverter implements DomainConverter<ReservationHold, String> {

	@Override
	public String fromDomainToValue(ReservationHold domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReservationHold fromValueToDomain(String value) {
		return new RESERVATION_HOLD(value);
	}

}
