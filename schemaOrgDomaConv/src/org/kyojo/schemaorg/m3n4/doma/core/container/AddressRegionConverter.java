package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ADDRESS_REGION;
import org.kyojo.schemaorg.m3n4.core.Container.AddressRegion;

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
