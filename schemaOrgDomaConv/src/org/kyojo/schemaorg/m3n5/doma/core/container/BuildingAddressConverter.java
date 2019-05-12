package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BUILDING_ADDRESS;
import org.kyojo.schemaorg.m3n5.core.Container.BuildingAddress;

@ExternalDomain
public class BuildingAddressConverter implements DomainConverter<BuildingAddress, String> {

	@Override
	public String fromDomainToValue(BuildingAddress domain) {
		return domain.getNativeValue();
	}

	@Override
	public BuildingAddress fromValueToDomain(String value) {
		return new BUILDING_ADDRESS(value);
	}

}
