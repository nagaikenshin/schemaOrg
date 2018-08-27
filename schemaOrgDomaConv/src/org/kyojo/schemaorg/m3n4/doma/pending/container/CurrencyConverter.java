package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.CURRENCY;
import org.kyojo.schemaorg.m3n4.pending.Container.Currency;

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
