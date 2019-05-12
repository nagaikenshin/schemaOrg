package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COUNTRY;
import org.kyojo.schemaorg.m3n5.core.Clazz.Country;

@ExternalDomain
public class CountryConverter implements DomainConverter<Country, String> {

	@Override
	public String fromDomainToValue(Country domain) {
		return domain.getNativeValue();
	}

	@Override
	public Country fromValueToDomain(String value) {
		return new COUNTRY(value);
	}

}
