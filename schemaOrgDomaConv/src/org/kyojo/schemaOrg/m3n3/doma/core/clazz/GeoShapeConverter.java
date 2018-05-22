package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GEO_SHAPE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GeoShape;

@ExternalDomain
public class GeoShapeConverter implements DomainConverter<GeoShape, String> {

	@Override
	public String fromDomainToValue(GeoShape domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoShape fromValueToDomain(String value) {
		return new GEO_SHAPE(value);
	}

}
