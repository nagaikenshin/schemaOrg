package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.EXCHANGE_RATE;
import org.kyojo.schemaOrg.m3n3.pending.Container.ExchangeRate;

@ExternalDomain
public class ExchangeRateConverter implements DomainConverter<ExchangeRate, String> {

	@Override
	public String fromDomainToValue(ExchangeRate domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExchangeRate fromValueToDomain(String value) {
		return new EXCHANGE_RATE(value);
	}

}
