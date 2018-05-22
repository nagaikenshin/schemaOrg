package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.HEALTH_PLAN_COINSURANCE_OPTION;
import org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanCoinsuranceOption;

@ExternalDomain
public class HealthPlanCoinsuranceOptionConverter implements DomainConverter<HealthPlanCoinsuranceOption, String> {

	@Override
	public String fromDomainToValue(HealthPlanCoinsuranceOption domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanCoinsuranceOption fromValueToDomain(String value) {
		return new HEALTH_PLAN_COINSURANCE_OPTION(value);
	}

}
