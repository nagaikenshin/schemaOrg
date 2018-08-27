package org.kyojo.schemaorg.m3n4.doma.core.dayOfWeek;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.dayOfWeek.PUBLIC_HOLIDAYS;
import org.kyojo.schemaorg.m3n4.core.DayOfWeek.PublicHolidays;

@ExternalDomain
public class PublicHolidaysConverter implements DomainConverter<PublicHolidays, String> {

	@Override
	public String fromDomainToValue(PublicHolidays domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublicHolidays fromValueToDomain(String value) {
		return new PUBLIC_HOLIDAYS(value);
	}

}
