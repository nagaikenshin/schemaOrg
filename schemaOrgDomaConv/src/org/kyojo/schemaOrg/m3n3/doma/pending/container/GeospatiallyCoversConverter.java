package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GEOSPATIALLY_COVERS;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCovers;

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
