package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RUNTIME_PLATFORM;
import org.kyojo.schemaorg.m3n5.core.Container.RuntimePlatform;

@ExternalDomain
public class RuntimePlatformConverter implements DomainConverter<RuntimePlatform, String> {

	@Override
	public String fromDomainToValue(RuntimePlatform domain) {
		return domain.getNativeValue();
	}

	@Override
	public RuntimePlatform fromValueToDomain(String value) {
		return new RUNTIME_PLATFORM(value);
	}

}
