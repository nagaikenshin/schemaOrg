package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.HEALTH_PLAN_COST_SHARING_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.HealthPlanCostSharingSpecification;

@ExternalDomain
public class HealthPlanCostSharingSpecificationConverter implements DomainConverter<HealthPlanCostSharingSpecification, String> {

	@Override
	public String fromDomainToValue(HealthPlanCostSharingSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanCostSharingSpecification fromValueToDomain(String value) {
		return new HEALTH_PLAN_COST_SHARING_SPECIFICATION(value);
	}

}
