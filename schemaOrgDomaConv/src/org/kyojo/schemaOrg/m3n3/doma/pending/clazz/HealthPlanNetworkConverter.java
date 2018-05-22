package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.HEALTH_PLAN_NETWORK;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.HealthPlanNetwork;

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
