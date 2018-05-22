package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LOCATION;
import org.kyojo.schemaOrg.m3n3.core.Container.Location;

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
