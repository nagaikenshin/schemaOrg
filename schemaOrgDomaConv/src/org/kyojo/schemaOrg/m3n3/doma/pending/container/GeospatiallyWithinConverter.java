package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GEOSPATIALLY_WITHIN;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyWithin;

@ExternalDomain
public class GeospatiallyWithinConverter implements DomainConverter<GeospatiallyWithin, String> {

	@Override
	public String fromDomainToValue(GeospatiallyWithin domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatiallyWithin fromValueToDomain(String value) {
		return new GEOSPATIALLY_WITHIN(value);
	}

}
