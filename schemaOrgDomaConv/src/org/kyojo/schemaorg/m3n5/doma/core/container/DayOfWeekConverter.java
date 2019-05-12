package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DAY_OF_WEEK;
import org.kyojo.schemaorg.m3n5.core.Container.DayOfWeek;

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
