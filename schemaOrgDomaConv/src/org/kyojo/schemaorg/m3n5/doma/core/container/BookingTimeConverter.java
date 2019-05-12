package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BOOKING_TIME;
import org.kyojo.schemaorg.m3n5.core.Container.BookingTime;

@ExternalDomain
public class BookingTimeConverter implements DomainConverter<BookingTime, Date> {

	@Override
	public Date fromDomainToValue(BookingTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public BookingTime fromValueToDomain(Date value) {
		return new BOOKING_TIME(value);
	}

}