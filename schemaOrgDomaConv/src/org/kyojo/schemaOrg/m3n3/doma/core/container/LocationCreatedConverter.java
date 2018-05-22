package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LOCATION_CREATED;
import org.kyojo.schemaOrg.m3n3.core.Container.LocationCreated;

@ExternalDomain
public class LocationCreatedConverter implements DomainConverter<LocationCreated, String> {

	@Override
	public String fromDomainToValue(LocationCreated domain) {
		return domain.getNativeValue();
	}

	@Override
	public LocationCreated fromValueToDomain(String value) {
		return new LOCATION_CREATED(value);
	}

}
