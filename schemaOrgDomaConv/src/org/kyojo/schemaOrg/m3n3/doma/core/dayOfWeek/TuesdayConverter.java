package org.kyojo.schemaOrg.m3n3.doma.core.dayOfWeek;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.dayOfWeek.TUESDAY;
import org.kyojo.schemaOrg.m3n3.core.DayOfWeek.Tuesday;

@ExternalDomain
public class TuesdayConverter implements DomainConverter<Tuesday, String> {

	@Override
	public String fromDomainToValue(Tuesday domain) {
		return domain.getNativeValue();
	}

	@Override
	public Tuesday fromValueToDomain(String value) {
		return new TUESDAY(value);
	}

}
