package org.kyojo.schemaorg.m3n5.doma.core.dayOfWeek;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.dayOfWeek.SATURDAY;
import org.kyojo.schemaorg.m3n5.core.DayOfWeek.Saturday;

@ExternalDomain
public class SaturdayConverter implements DomainConverter<Saturday, String> {

	@Override
	public String fromDomainToValue(Saturday domain) {
		return domain.getNativeValue();
	}

	@Override
	public Saturday fromValueToDomain(String value) {
		return new SATURDAY(value);
	}

}