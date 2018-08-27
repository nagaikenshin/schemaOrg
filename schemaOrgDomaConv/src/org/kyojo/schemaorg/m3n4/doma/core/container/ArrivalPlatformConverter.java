package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ARRIVAL_PLATFORM;
import org.kyojo.schemaorg.m3n4.core.Container.ArrivalPlatform;

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
