package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_INTERSECTS;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyIntersects;

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
