package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_PLAN_DRUG_TIER;
import org.kyojo.schemaorg.m3n5.pending.Container.HealthPlanDrugTier;

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
