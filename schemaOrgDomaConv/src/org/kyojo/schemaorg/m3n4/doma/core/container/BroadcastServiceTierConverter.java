package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BROADCAST_SERVICE_TIER;
import org.kyojo.schemaorg.m3n4.core.Container.BroadcastServiceTier;

@ExternalDomain
public class BroadcastServiceTierConverter implements DomainConverter<BroadcastServiceTier, String> {

	@Override
	public String fromDomainToValue(BroadcastServiceTier domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastServiceTier fromValueToDomain(String value) {
		return new BROADCAST_SERVICE_TIER(value);
	}

}
