package org.kyojo.schemaorg.m3n4.doma.core.dayOfWeek;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.dayOfWeek.WEDNESDAY;
import org.kyojo.schemaorg.m3n4.core.DayOfWeek.Wednesday;

@ExternalDomain
public class WednesdayConverter implements DomainConverter<Wednesday, String> {

	@Override
	public String fromDomainToValue(Wednesday domain) {
		return domain.getNativeValue();
	}

	@Override
	public Wednesday fromValueToDomain(String value) {
		return new WEDNESDAY(value);
	}

}
