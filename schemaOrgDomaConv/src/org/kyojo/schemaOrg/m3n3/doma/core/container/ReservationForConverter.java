package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESERVATION_FOR;
import org.kyojo.schemaOrg.m3n3.core.Container.ReservationFor;

@ExternalDomain
public class ReservationForConverter implements DomainConverter<ReservationFor, String> {

	@Override
	public String fromDomainToValue(ReservationFor domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReservationFor fromValueToDomain(String value) {
		return new RESERVATION_FOR(value);
	}

}
