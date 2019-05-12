package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.IS_LIVE_BROADCAST;
import org.kyojo.schemaorg.m3n5.core.Container.IsLiveBroadcast;

@ExternalDomain
public class IsLiveBroadcastConverter implements DomainConverter<IsLiveBroadcast, Boolean> {

	@Override
	public Boolean fromDomainToValue(IsLiveBroadcast domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsLiveBroadcast fromValueToDomain(Boolean value) {
		return new IS_LIVE_BROADCAST(value);
	}

}
