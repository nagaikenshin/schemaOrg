package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.HEALTH_PLAN_COINSURANCE_RATE;
import org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanCoinsuranceRate;

@ExternalDomain
public class HealthPlanCoinsuranceRateConverter implements DomainConverter<HealthPlanCoinsuranceRate, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(HealthPlanCoinsuranceRate domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthPlanCoinsuranceRate fromValueToDomain(BigDecimal value) {
		return new HEALTH_PLAN_COINSURANCE_RATE(value);
	}

}
