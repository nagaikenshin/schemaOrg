package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.STREET_ADDRESS;
import org.kyojo.schemaOrg.m3n3.core.Container.StreetAddress;

@ExternalDomain
public class StreetAddressConverter implements DomainConverter<StreetAddress, String> {

	@Override
	public String fromDomainToValue(StreetAddress domain) {
		return domain.getNativeValue();
	}

	@Override
	public StreetAddress fromValueToDomain(String value) {
		return new STREET_ADDRESS(value);
	}

}
