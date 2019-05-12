package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PLAN_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.PlanAction;

@ExternalDomain
public class PlanActionConverter implements DomainConverter<PlanAction, String> {

	@Override
	public String fromDomainToValue(PlanAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public PlanAction fromValueToDomain(String value) {
		return new PLAN_ACTION(value);
	}

}
