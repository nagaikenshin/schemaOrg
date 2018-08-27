package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GEO_SHAPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeoShape;

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
