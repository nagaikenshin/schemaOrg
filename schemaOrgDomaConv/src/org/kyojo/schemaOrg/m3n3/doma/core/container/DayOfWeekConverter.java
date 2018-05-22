package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DAY_OF_WEEK;
import org.kyojo.schemaOrg.m3n3.core.Container.DayOfWeek;

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
