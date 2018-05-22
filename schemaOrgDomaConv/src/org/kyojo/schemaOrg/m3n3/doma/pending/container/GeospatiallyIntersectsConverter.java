package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GEOSPATIALLY_INTERSECTS;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyIntersects;

@ExternalDomain
public class GeospatiallyIntersectsConverter implements DomainConverter<GeospatiallyIntersects, String> {

	@Override
	public String fromDomainToValue(GeospatiallyIntersects domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatiallyIntersects fromValueToDomain(String value) {
		return new GEOSPATIALLY_INTERSECTS(value);
	}

}
