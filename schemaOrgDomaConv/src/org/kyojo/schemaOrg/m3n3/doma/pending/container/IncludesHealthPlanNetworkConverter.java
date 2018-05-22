package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.INCLUDES_HEALTH_PLAN_NETWORK;
import org.kyojo.schemaOrg.m3n3.pending.Container.IncludesHealthPlanNetwork;

@ExternalDomain
public class IncludesHealthPlanNetworkConverter implements DomainConverter<IncludesHealthPlanNetwork, String> {

	@Override
	public String fromDomainToValue(IncludesHealthPlanNetwork domain) {
		return domain.getNativeValue();
	}

	@Override
	public IncludesHealthPlanNetwork fromValueToDomain(String value) {
		return new INCLUDES_HEALTH_PLAN_NETWORK(value);
	}

}
