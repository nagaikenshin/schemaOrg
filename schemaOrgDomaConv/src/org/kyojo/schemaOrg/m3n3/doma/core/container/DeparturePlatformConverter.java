package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPARTURE_PLATFORM;
import org.kyojo.schemaOrg.m3n3.core.Container.DeparturePlatform;

@ExternalDomain
public class DeparturePlatformConverter implements DomainConverter<DeparturePlatform, String> {

	@Override
	public String fromDomainToValue(DeparturePlatform domain) {
		return domain.getNativeValue();
	}

	@Override
	public DeparturePlatform fromValueToDomain(String value) {
		return new DEPARTURE_PLATFORM(value);
	}

}
