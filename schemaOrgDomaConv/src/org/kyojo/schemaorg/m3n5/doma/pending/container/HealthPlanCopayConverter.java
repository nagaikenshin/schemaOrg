package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_PLAN_COPAY;
import org.kyojo.schemaorg.m3n5.pending.Container.HealthPlanCopay;

@ExternalDomain
public class HealthPlanCopayConverter implements DomainConverter<HealthPlanCopay, String> {

	@Override
	public String fromDomainToValue(HealthPlanCopay domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanCopay fromValueToDomain(String value) {
		return new HEALTH_PLAN_COPAY(value);
	}

}
