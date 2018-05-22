package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PLAN_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PlanAction;

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
