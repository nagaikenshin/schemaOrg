package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OPENING_HOURS;
import org.kyojo.schemaOrg.m3n3.core.Container.OpeningHours;

@ExternalDomain
public class OpeningHoursConverter implements DomainConverter<OpeningHours, String> {

	@Override
	public String fromDomainToValue(OpeningHours domain) {
		return domain.getNativeValue();
	}

	@Override
	public OpeningHours fromValueToDomain(String value) {
		return new OPENING_HOURS(value);
	}

}
