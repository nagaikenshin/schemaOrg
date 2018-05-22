package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRICE_CURRENCY;
import org.kyojo.schemaOrg.m3n3.core.Container.PriceCurrency;

@ExternalDomain
public class PriceCurrencyConverter implements DomainConverter<PriceCurrency, String> {

	@Override
	public String fromDomainToValue(PriceCurrency domain) {
		return domain.getNativeValue();
	}

	@Override
	public PriceCurrency fromValueToDomain(String value) {
		return new PRICE_CURRENCY(value);
	}

}
