package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TICKER_SYMBOL;
import org.kyojo.schemaorg.m3n4.core.Container.TickerSymbol;

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