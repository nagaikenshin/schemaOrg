package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GEOSPATIALLY_OVERLAPS;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyOverlaps;

@ExternalDomain
public class GeospatiallyOverlapsConverter implements DomainConverter<GeospatiallyOverlaps, String> {

	@Override
	public String fromDomainToValue(GeospatiallyOverlaps domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatiallyOverlaps fromValueToDomain(String value) {
		return new GEOSPATIALLY_OVERLAPS(value);
	}

}
