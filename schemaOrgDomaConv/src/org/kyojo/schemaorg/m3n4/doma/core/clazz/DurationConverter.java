package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DURATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.Duration;

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
