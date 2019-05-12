package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ADDRESS_LOCALITY;
import org.kyojo.schemaorg.m3n5.core.Container.AddressLocality;

@ExternalDomain
public class AddressLocalityConverter implements DomainConverter<AddressLocality, String> {

	@Override
	public String fromDomainToValue(AddressLocality domain) {
		return domain.getNativeValue();
	}

	@Override
	public AddressLocality fromValueToDomain(String value) {
		return new ADDRESS_LOCALITY(value);
	}

}