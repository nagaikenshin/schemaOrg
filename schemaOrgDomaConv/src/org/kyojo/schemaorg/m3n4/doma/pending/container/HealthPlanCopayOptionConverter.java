package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.HEALTH_PLAN_COPAY_OPTION;
import org.kyojo.schemaorg.m3n4.pending.Container.HealthPlanCopayOption;

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
