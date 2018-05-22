package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.HEALTH_PLAN_DRUG_TIER;
import org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanDrugTier;

@ExternalDomain
public class HealthPlanDrugTierConverter implements DomainConverter<HealthPlanDrugTier, String> {

	@Override
	public String fromDomainToValue(HealthPlanDrugTier domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanDrugTier fromValueToDomain(String value) {
		return new HEALTH_PLAN_DRUG_TIER(value);
	}

}
