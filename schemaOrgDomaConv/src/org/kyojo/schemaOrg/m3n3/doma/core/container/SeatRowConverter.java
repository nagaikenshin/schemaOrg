package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SEAT_ROW;
import org.kyojo.schemaOrg.m3n3.core.Container.SeatRow;

@ExternalDomain
public class SeatRowConverter implements DomainConverter<SeatRow, String> {

	@Override
	public String fromDomainToValue(SeatRow domain) {
		return domain.getNativeValue();
	}

	@Override
	public SeatRow fromValueToDomain(String value) {
		return new SEAT_ROW(value);
	}

}
