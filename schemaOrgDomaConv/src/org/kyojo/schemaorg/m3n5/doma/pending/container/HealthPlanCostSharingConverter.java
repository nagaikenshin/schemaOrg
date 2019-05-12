package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_PLAN_COST_SHARING;
import org.kyojo.schemaorg.m3n5.pending.Container.HealthPlanCostSharing;

@ExternalDomain
public class HealthPlanCostSharingConverter implements DomainConverter<HealthPlanCostSharing, Boolean> {

	@Override
	public Boolean fromDomainToValue(HealthPlanCostSharing domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanCostSharing fromValueToDomain(Boolean value) {
		return new HEALTH_PLAN_COST_SHARING(value);
	}

}
