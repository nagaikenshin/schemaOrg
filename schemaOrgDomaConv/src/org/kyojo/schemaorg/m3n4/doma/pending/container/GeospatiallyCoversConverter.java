package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_COVERS;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyCovers;

@ExternalDomain
public class GeospatiallyCoversConverter implements DomainConverter<GeospatiallyCovers, String> {

	@Override
	public String fromDomainToValue(GeospatiallyCovers domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatiallyCovers fromValueToDomain(String value) {
		return new GEOSPATIALLY_COVERS(value);
	}

}
