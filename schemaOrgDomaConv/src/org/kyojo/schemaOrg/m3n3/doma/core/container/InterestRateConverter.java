package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INTEREST_RATE;
import org.kyojo.schemaOrg.m3n3.core.Container.InterestRate;

@ExternalDomain
public class InterestRateConverter implements DomainConverter<InterestRate, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(InterestRate domain) {
		return domain.getNativeValue();
	}

	@Override
	public InterestRate fromValueToDomain(BigDecimal value) {
		return new INTEREST_RATE(value);
	}

}
