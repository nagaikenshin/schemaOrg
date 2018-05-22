package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TIME_REQUIRED;
import org.kyojo.schemaOrg.m3n3.core.Container.TimeRequired;

@ExternalDomain
public class TimeRequiredConverter implements DomainConverter<TimeRequired, String> {

	@Override
	public String fromDomainToValue(TimeRequired domain) {
		return domain.getNativeValue();
	}

	@Override
	public TimeRequired fromValueToDomain(String value) {
		return new TIME_REQUIRED(value);
	}

}
