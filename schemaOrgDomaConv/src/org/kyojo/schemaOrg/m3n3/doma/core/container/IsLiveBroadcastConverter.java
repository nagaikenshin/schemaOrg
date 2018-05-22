package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IS_LIVE_BROADCAST;
import org.kyojo.schemaOrg.m3n3.core.Container.IsLiveBroadcast;

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
