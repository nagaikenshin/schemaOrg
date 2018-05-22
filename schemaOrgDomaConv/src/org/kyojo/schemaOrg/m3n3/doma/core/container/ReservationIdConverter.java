package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESERVATION_ID;
import org.kyojo.schemaOrg.m3n3.core.Container.ReservationId;

@ExternalDomain
public class ReservationIdConverter implements DomainConverter<ReservationId, String> {

	@Override
	public String fromDomainToValue(ReservationId domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReservationId fromValueToDomain(String value) {
		return new RESERVATION_ID(value);
	}

}
