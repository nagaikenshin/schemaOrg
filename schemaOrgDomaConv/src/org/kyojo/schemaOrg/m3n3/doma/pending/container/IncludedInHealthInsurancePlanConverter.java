package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.INCLUDED_IN_HEALTH_INSURANCE_PLAN;
import org.kyojo.schemaOrg.m3n3.pending.Container.IncludedInHealthInsurancePlan;

@ExternalDomain
public class IncludedInHealthInsurancePlanConverter implements DomainConverter<IncludedInHealthInsurancePlan, String> {

	@Override
	public String fromDomainToValue(IncludedInHealthInsurancePlan domain) {
		return domain.getNativeValue();
	}

	@Override
	public IncludedInHealthInsurancePlan fromValueToDomain(String value) {
		return new INCLUDED_IN_HEALTH_INSURANCE_PLAN(value);
	}

}
