package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ADDRESS_REGION;
import org.kyojo.schemaOrg.m3n3.core.Container.AddressRegion;

@ExternalDomain
public class AddressRegionConverter implements DomainConverter<AddressRegion, String> {

	@Override
	public String fromDomainToValue(AddressRegion domain) {
		return domain.getNativeValue();
	}

	@Override
	public AddressRegion fromValueToDomain(String value) {
		return new ADDRESS_REGION(value);
	}

}
