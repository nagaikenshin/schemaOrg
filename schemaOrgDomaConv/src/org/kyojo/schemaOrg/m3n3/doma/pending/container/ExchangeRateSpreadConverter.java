package org.kyojo.schemaorg.m3n3.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.pending.impl.EXCHANGE_RATE_SPREAD;
import org.kyojo.schemaorg.m3n3.pending.Container.ExchangeRateSpread;

@ExternalDomain
public class ExchangeRateSpreadConverter implements DomainConverter<ExchangeRateSpread, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(ExchangeRateSpread domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExchangeRateSpread fromValueToDomain(BigDecimal value) {
		return new EXCHANGE_RATE_SPREAD(value);
	}

}
