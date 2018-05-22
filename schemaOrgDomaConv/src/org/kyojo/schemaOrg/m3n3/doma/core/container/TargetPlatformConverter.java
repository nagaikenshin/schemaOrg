package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TARGET_PLATFORM;
import org.kyojo.schemaOrg.m3n3.core.Container.TargetPlatform;

@ExternalDomain
public class TargetPlatformConverter implements DomainConverter<TargetPlatform, String> {

	@Override
	public String fromDomainToValue(TargetPlatform domain) {
		return domain.getNativeValue();
	}

	@Override
	public TargetPlatform fromValueToDomain(String value) {
		return new TARGET_PLATFORM(value);
	}

}
