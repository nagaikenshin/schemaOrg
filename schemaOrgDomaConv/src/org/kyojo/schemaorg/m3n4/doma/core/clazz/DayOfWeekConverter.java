package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DAY_OF_WEEK;
import org.kyojo.schemaorg.m3n4.core.Clazz.DayOfWeek;

@ExternalDomain
public class DayOfWeekConverter implements DomainConverter<DayOfWeek, String> {

	@Override
	public String fromDomainToValue(DayOfWeek domain) {
		return domain.getNativeValue();
	}

	@Override
	public DayOfWeek fromValueToDomain(String value) {
		return new DAY_OF_WEEK(value);
	}

}
