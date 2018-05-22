package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TICKER_SYMBOL;
import org.kyojo.schemaOrg.m3n3.core.Container.TickerSymbol;

@ExternalDomain
public class TickerSymbolConverter implements DomainConverter<TickerSymbol, String> {

	@Override
	public String fromDomainToValue(TickerSymbol domain) {
		return domain.getNativeValue();
	}

	@Override
	public TickerSymbol fromValueToDomain(String value) {
		return new TICKER_SYMBOL(value);
	}

}
