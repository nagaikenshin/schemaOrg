package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CURRENCY;
import org.kyojo.schemaOrg.m3n3.core.Container.Currency;

@ExternalDomain
public class CurrencyConverter implements DomainConverter<Currency, String> {

	@Override
	public String fromDomainToValue(Currency domain) {
		return domain.getNativeValue();
	}

	@Override
	public Currency fromValueToDomain(String value) {
		return new CURRENCY(value);
	}

}
