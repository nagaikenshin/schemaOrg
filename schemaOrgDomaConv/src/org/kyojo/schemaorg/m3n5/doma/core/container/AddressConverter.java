package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ADDRESS;
import org.kyojo.schemaorg.m3n5.core.Container.Address;

@ExternalDomain
public class AddressConverter implements DomainConverter<Address, String> {

	@Override
	public String fromDomainToValue(Address domain) {
		return domain.getNativeValue();
	}

	@Override
	public Address fromValueToDomain(String value) {
		return new ADDRESS(value);
	}

}
