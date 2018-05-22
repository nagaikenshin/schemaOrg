package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISCOUNT_CURRENCY;
import org.kyojo.schemaOrg.m3n3.core.Container.DiscountCurrency;

@ExternalDomain
public class DiscountCurrencyConverter implements DomainConverter<DiscountCurrency, String> {

	@Override
	public String fromDomainToValue(DiscountCurrency domain) {
		return domain.getNativeValue();
	}

	@Override
	public DiscountCurrency fromValueToDomain(String value) {
		return new DISCOUNT_CURRENCY(value);
	}

}
