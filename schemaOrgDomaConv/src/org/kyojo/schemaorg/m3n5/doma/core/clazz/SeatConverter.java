package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SEAT;
import org.kyojo.schemaorg.m3n5.core.Clazz.Seat;

@ExternalDomain
public class SeatConverter implements DomainConverter<Seat, String> {

	@Override
	public String fromDomainToValue(Seat domain) {
		return domain.getNativeValue();
	}

	@Override
	public Seat fromValueToDomain(String value) {
		return new SEAT(value);
	}

}