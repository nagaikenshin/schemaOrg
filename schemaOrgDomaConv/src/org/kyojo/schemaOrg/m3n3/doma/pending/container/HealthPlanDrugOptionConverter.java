package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.HEALTH_PLAN_DRUG_OPTION;
import org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanDrugOption;

@ExternalDomain
public class HealthPlanDrugOptionConverter implements DomainConverter<HealthPlanDrugOption, String> {

	@Override
	public String fromDomainToValue(HealthPlanDrugOption domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanDrugOption fromValueToDomain(String value) {
		return new HEALTH_PLAN_DRUG_OPTION(value);
	}

}
