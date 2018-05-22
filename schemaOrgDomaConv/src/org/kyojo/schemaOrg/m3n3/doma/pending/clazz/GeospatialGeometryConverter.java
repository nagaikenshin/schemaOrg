package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GEOSPATIAL_GEOMETRY;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.GeospatialGeometry;

@ExternalDomain
public class GeospatialGeometryConverter implements DomainConverter<GeospatialGeometry, String> {

	@Override
	public String fromDomainToValue(GeospatialGeometry domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatialGeometry fromValueToDomain(String value) {
		return new GEOSPATIAL_GEOMETRY(value);
	}

}
