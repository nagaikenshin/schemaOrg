package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COUNTRIES_SUPPORTED;
import org.kyojo.schemaOrg.m3n3.core.Container.CountriesSupported;

@ExternalDomain
public class CountriesSupportedConverter implements DomainConverter<CountriesSupported, String> {

	@Override
	public String fromDomainToValue(CountriesSupported domain) {
		return domain.getNativeValue();
	}

	@Override
	public CountriesSupported fromValueToDomain(String value) {
		return new COUNTRIES_SUPPORTED(value);
	}

}
