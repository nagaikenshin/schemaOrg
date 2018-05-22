package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ARRIVAL_PLATFORM;
import org.kyojo.schemaOrg.m3n3.core.Container.ArrivalPlatform;

@ExternalDomain
public class ArrivalPlatformConverter implements DomainConverter<ArrivalPlatform, String> {

	@Override
	public String fromDomainToValue(ArrivalPlatform domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArrivalPlatform fromValueToDomain(String value) {
		return new ARRIVAL_PLATFORM(value);
	}

}
