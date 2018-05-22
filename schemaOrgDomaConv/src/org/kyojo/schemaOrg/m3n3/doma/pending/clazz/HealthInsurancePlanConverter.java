package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.HEALTH_INSURANCE_PLAN;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.HealthInsurancePlan;

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
