package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.CURRENT_EXCHANGE_RATE;
import org.kyojo.schemaOrg.m3n3.pending.Container.CurrentExchangeRate;

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
