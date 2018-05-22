package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.HEALTH_PLAN_MARKETING_URL;
import org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanMarketingUrl;

@ExternalDomain
public class HealthPlanMarketingUrlConverter implements DomainConverter<HealthPlanMarketingUrl, String> {

	@Override
	public String fromDomainToValue(HealthPlanMarketingUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanMarketingUrl fromValueToDomain(String value) {
		return new HEALTH_PLAN_MARKETING_URL(value);
	}

}
