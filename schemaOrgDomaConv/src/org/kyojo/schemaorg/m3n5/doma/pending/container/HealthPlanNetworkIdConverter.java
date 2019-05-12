package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_PLAN_NETWORK_ID;
import org.kyojo.schemaorg.m3n5.pending.Container.HealthPlanNetworkId;

@ExternalDomain
public class HealthPlanNetworkIdConverter implements DomainConverter<HealthPlanNetworkId, String> {

	@Override
	public String fromDomainToValue(HealthPlanNetworkId domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanNetworkId fromValueToDomain(String value) {
		return new HEALTH_PLAN_NETWORK_ID(value);
	}

}
