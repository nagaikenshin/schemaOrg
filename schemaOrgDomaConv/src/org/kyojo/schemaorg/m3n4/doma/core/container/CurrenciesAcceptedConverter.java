package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CURRENCIES_ACCEPTED;
import org.kyojo.schemaorg.m3n4.core.Container.CurrenciesAccepted;

@ExternalDomain
public class CurrenciesAcceptedConverter implements DomainConverter<CurrenciesAccepted, String> {

	@Override
	public String fromDomainToValue(CurrenciesAccepted domain) {
		return domain.getNativeValue();
	}

	@Override
	public CurrenciesAccepted fromValueToDomain(String value) {
		return new CURRENCIES_ACCEPTED(value);
	}

}
