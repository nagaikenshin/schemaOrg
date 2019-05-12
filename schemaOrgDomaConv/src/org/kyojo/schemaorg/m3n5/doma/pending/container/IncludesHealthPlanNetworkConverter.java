package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.INCLUDES_HEALTH_PLAN_NETWORK;
import org.kyojo.schemaorg.m3n5.pending.Container.IncludesHealthPlanNetwork;

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
