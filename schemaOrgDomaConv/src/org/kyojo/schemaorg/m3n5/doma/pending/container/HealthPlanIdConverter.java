package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_PLAN_ID;
import org.kyojo.schemaorg.m3n5.pending.Container.HealthPlanId;

@ExternalDomain
public class HealthPlanIdConverter implements DomainConverter<HealthPlanId, String> {

	@Override
	public String fromDomainToValue(HealthPlanId domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanId fromValueToDomain(String value) {
		return new HEALTH_PLAN_ID(value);
	}

}
