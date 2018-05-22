package org.kyojo.schemaOrg.m3n3.doma.core.dayOfWeek;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.dayOfWeek.PUBLIC_HOLIDAYS;
import org.kyojo.schemaOrg.m3n3.core.DayOfWeek.PublicHolidays;

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
