package org.kyojo.schemaorg.m3n4.doma.core.dayOfWeek;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.dayOfWeek.SUNDAY;
import org.kyojo.schemaorg.m3n4.core.DayOfWeek.Sunday;

@ExternalDomain
public class SundayConverter implements DomainConverter<Sunday, String> {

	@Override
	public String fromDomainToValue(Sunday domain) {
		return domain.getNativeValue();
	}

	@Override
	public Sunday fromValueToDomain(String value) {
		return new SUNDAY(value);
	}

}
