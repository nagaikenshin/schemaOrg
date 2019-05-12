package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_INSURANCE_PLAN;
import org.kyojo.schemaorg.m3n5.pending.Clazz.HealthInsurancePlan;

@ExternalDomain
public class HealthInsurancePlanConverter implements DomainConverter<HealthInsurancePlan, String> {

	@Override
	public String fromDomainToValue(HealthInsurancePlan domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthInsurancePlan fromValueToDomain(String value) {
		return new HEALTH_INSURANCE_PLAN(value);
	}

}
