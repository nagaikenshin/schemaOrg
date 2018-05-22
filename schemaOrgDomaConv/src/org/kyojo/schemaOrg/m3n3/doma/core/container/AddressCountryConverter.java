package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ADDRESS_COUNTRY;
import org.kyojo.schemaOrg.m3n3.core.Container.AddressCountry;

@ExternalDomain
public class AddressCountryConverter implements DomainConverter<AddressCountry, String> {

	@Override
	public String fromDomainToValue(AddressCountry domain) {
		return domain.getNativeValue();
	}

	@Override
	public AddressCountry fromValueToDomain(String value) {
		return new ADDRESS_COUNTRY(value);
	}

}
