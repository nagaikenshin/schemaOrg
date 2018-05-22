package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.HEALTH_PLAN_ID;
import org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanId;

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
