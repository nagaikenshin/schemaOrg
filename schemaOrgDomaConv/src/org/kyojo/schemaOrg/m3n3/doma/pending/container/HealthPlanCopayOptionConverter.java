package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.HEALTH_PLAN_COPAY_OPTION;
import org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanCopayOption;

@ExternalDomain
public class HealthPlanCopayOptionConverter implements DomainConverter<HealthPlanCopayOption, String> {

	@Override
	public String fromDomainToValue(HealthPlanCopayOption domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanCopayOption fromValueToDomain(String value) {
		return new HEALTH_PLAN_COPAY_OPTION(value);
	}

}
