package org.kyojo.schemaOrg.m3n3.doma.core.dayOfWeek;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.dayOfWeek.FRIDAY;
import org.kyojo.schemaOrg.m3n3.core.DayOfWeek.Friday;

@ExternalDomain
public class FridayConverter implements DomainConverter<Friday, String> {

	@Override
	public String fromDomainToValue(Friday domain) {
		return domain.getNativeValue();
	}

	@Override
	public Friday fromValueToDomain(String value) {
		return new FRIDAY(value);
	}

}
