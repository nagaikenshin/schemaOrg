package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COUNTRY_OF_ORIGIN;
import org.kyojo.schemaorg.m3n5.core.Container.CountryOfOrigin;

@ExternalDomain
public class CountryOfOriginConverter implements DomainConverter<CountryOfOrigin, String> {

	@Override
	public String fromDomainToValue(CountryOfOrigin domain) {
		return domain.getNativeValue();
	}

	@Override
	public CountryOfOrigin fromValueToDomain(String value) {
		return new COUNTRY_OF_ORIGIN(value);
	}

}
