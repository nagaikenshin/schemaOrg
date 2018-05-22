package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESERVATION_STATUS;
import org.kyojo.schemaOrg.m3n3.core.Container.ReservationStatus;

@ExternalDomain
public class ReservationStatusConverter implements DomainConverter<ReservationStatus, String> {

	@Override
	public String fromDomainToValue(ReservationStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReservationStatus fromValueToDomain(String value) {
		return new RESERVATION_STATUS(value);
	}

}
