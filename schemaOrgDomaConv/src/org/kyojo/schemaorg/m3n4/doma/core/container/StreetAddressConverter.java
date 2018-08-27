package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.STREET_ADDRESS;
import org.kyojo.schemaorg.m3n4.core.Container.StreetAddress;

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
