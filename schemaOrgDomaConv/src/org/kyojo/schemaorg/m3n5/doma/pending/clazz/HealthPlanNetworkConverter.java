package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_PLAN_NETWORK;
import org.kyojo.schemaorg.m3n5.pending.Clazz.HealthPlanNetwork;

@ExternalDomain
public class HealthPlanNetworkConverter implements DomainConverter<HealthPlanNetwork, String> {

	@Override
	public String fromDomainToValue(HealthPlanNetwork domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanNetwork fromValueToDomain(String value) {
		return new HEALTH_PLAN_NETWORK(value);
	}

}
