package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DURATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Duration;

@ExternalDomain
public class DurationConverter implements DomainConverter<Duration, String> {

	@Override
	public String fromDomainToValue(Duration domain) {
		return domain.getNativeValue();
	}

	@Override
	public Duration fromValueToDomain(String value) {
		return new DURATION(value);
	}

}
