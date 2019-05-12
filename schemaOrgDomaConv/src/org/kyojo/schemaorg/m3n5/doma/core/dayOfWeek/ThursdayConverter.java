package org.kyojo.schemaorg.m3n5.doma.core.dayOfWeek;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.dayOfWeek.THURSDAY;
import org.kyojo.schemaorg.m3n5.core.DayOfWeek.Thursday;

@ExternalDomain
public class ThursdayConverter implements DomainConverter<Thursday, String> {

	@Override
	public String fromDomainToValue(Thursday domain) {
		return domain.getNativeValue();
	}

	@Override
	public Thursday fromValueToDomain(String value) {
		return new THURSDAY(value);
	}

}
