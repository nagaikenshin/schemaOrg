package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BROADCAST_SERVICE_TIER;
import org.kyojo.schemaOrg.m3n3.core.Container.BroadcastServiceTier;

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
