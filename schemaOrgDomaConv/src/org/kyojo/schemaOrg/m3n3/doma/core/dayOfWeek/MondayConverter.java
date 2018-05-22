package org.kyojo.schemaOrg.m3n3.doma.core.dayOfWeek;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.dayOfWeek.MONDAY;
import org.kyojo.schemaOrg.m3n3.core.DayOfWeek.Monday;

@ExternalDomain
public class MondayConverter implements DomainConverter<Monday, String> {

	@Override
	public String fromDomainToValue(Monday domain) {
		return domain.getNativeValue();
	}

	@Override
	public Monday fromValueToDomain(String value) {
		return new MONDAY(value);
	}

}
