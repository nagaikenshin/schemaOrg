package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PRICE_CURRENCY;
import org.kyojo.schemaorg.m3n4.core.Container.PriceCurrency;

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
