package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CURRENCY_CONVERSION_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Clazz.CurrencyConversionService;

@ExternalDomain
public class CurrencyConversionServiceConverter implements DomainConverter<CurrencyConversionService, String> {

	@Override
	public String fromDomainToValue(CurrencyConversionService domain) {
		return domain.getNativeValue();
	}

	@Override
	public CurrencyConversionService fromValueToDomain(String value) {
		return new CURRENCY_CONVERSION_SERVICE(value);
	}

}