package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.INCLUDES_HEALTH_PLAN_FORMULARY;
import org.kyojo.schemaorg.m3n5.pending.Container.IncludesHealthPlanFormulary;

@ExternalDomain
public class IncludesHealthPlanFormularyConverter implements DomainConverter<IncludesHealthPlanFormulary, String> {

	@Override
	public String fromDomainToValue(IncludesHealthPlanFormulary domain) {
		return domain.getNativeValue();
	}

	@Override
	public IncludesHealthPlanFormulary fromValueToDomain(String value) {
		return new INCLUDES_HEALTH_PLAN_FORMULARY(value);
	}

}
