package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CURRENT_EXCHANGE_RATE;
import org.kyojo.schemaorg.m3n5.pending.Container.CurrentExchangeRate;

@ExternalDomain
public class CurrentExchangeRateConverter implements DomainConverter<CurrentExchangeRate, String> {

	@Override
	public String fromDomainToValue(CurrentExchangeRate domain) {
		return domain.getNativeValue();
	}

	@Override
	public CurrentExchangeRate fromValueToDomain(String value) {
		return new CURRENT_EXCHANGE_RATE(value);
	}

}
