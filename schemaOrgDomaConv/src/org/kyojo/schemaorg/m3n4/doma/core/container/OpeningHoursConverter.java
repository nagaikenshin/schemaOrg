package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.OPENING_HOURS;
import org.kyojo.schemaorg.m3n4.core.Container.OpeningHours;

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
