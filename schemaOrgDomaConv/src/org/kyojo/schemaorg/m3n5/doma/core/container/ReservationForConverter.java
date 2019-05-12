package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RESERVATION_FOR;
import org.kyojo.schemaorg.m3n5.core.Container.ReservationFor;

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