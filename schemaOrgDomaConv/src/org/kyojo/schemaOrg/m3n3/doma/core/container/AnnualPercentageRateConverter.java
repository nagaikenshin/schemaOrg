package org.kyojo.schemaorg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.core.impl.ANNUAL_PERCENTAGE_RATE;
import org.kyojo.schemaorg.m3n3.core.Container.AnnualPercentageRate;

@ExternalDomain
public class AnnualPercentageRateConverter implements DomainConverter<AnnualPercentageRate, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(AnnualPercentageRate domain) {
		return domain.getNativeValue();
	}

	@Override
	public AnnualPercentageRate fromValueToDomain(BigDecimal value) {
		return new ANNUAL_PERCENTAGE_RATE(value);
	}

}
