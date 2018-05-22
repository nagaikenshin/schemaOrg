package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COUNTRIES_NOT_SUPPORTED;
import org.kyojo.schemaOrg.m3n3.core.Container.CountriesNotSupported;

@ExternalDomain
public class CountriesNotSupportedConverter implements DomainConverter<CountriesNotSupported, String> {

	@Override
	public String fromDomainToValue(CountriesNotSupported domain) {
		return domain.getNativeValue();
	}

	@Override
	public CountriesNotSupported fromValueToDomain(String value) {
		return new COUNTRIES_NOT_SUPPORTED(value);
	}

}
