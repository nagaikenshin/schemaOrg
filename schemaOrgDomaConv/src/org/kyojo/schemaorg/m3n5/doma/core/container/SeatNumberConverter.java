package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SEAT_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.SeatNumber;

@ExternalDomain
public class SeatNumberConverter implements DomainConverter<SeatNumber, String> {

	@Override
	public String fromDomainToValue(SeatNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public SeatNumber fromValueToDomain(String value) {
		return new SEAT_NUMBER(value);
	}

}
