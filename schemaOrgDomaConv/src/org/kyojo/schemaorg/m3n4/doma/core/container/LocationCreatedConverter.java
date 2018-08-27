package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LOCATION_CREATED;
import org.kyojo.schemaorg.m3n4.core.Container.LocationCreated;

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
