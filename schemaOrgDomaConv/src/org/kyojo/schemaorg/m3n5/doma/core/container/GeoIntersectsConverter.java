package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GEO_INTERSECTS;
import org.kyojo.schemaorg.m3n5.core.Container.GeoIntersects;

@ExternalDomain
public class GeoIntersectsConverter implements DomainConverter<GeoIntersects, String> {

	@Override
	public String fromDomainToValue(GeoIntersects domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoIntersects fromValueToDomain(String value) {
		return new GEO_INTERSECTS(value);
	}

}
