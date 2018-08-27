package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_OVERLAPS;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyOverlaps;

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
