package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.USES_HEALTH_PLAN_ID_STANDARD;
import org.kyojo.schemaOrg.m3n3.pending.Container.UsesHealthPlanIdStandard;

@ExternalDomain
public class UsesHealthPlanIdStandardConverter implements DomainConverter<UsesHealthPlanIdStandard, String> {

	@Override
	public String fromDomainToValue(UsesHealthPlanIdStandard domain) {
		return domain.getNativeValue();
	}

	@Override
	public UsesHealthPlanIdStandard fromValueToDomain(String value) {
		return new USES_HEALTH_PLAN_ID_STANDARD(value);
	}

}
