package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LOCATION;
import org.kyojo.schemaorg.m3n4.core.Container.Location;

@ExternalDomain
public class LocationConverter implements DomainConverter<Location, String> {

	@Override
	public String fromDomainToValue(Location domain) {
		return domain.getNativeValue();
	}

	@Override
	public Location fromValueToDomain(String value) {
		return new LOCATION(value);
	}

}
