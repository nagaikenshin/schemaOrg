package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.HEALTH_PLAN_FORMULARY;
import org.kyojo.schemaorg.m3n4.pending.Clazz.HealthPlanFormulary;

@ExternalDomain
public class HealthPlanFormularyConverter implements DomainConverter<HealthPlanFormulary, String> {

	@Override
	public String fromDomainToValue(HealthPlanFormulary domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanFormulary fromValueToDomain(String value) {
		return new HEALTH_PLAN_FORMULARY(value);
	}

}
