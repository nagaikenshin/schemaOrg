package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_PLAN_NETWORK_TIER;
import org.kyojo.schemaorg.m3n5.pending.Container.HealthPlanNetworkTier;

@ExternalDomain
public class HealthPlanNetworkTierConverter implements DomainConverter<HealthPlanNetworkTier, String> {

	@Override
	public String fromDomainToValue(HealthPlanNetworkTier domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanNetworkTier fromValueToDomain(String value) {
		return new HEALTH_PLAN_NETWORK_TIER(value);
	}

}
