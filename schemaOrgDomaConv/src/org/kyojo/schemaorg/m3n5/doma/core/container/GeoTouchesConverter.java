package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GEO_TOUCHES;
import org.kyojo.schemaorg.m3n5.core.Container.GeoTouches;

@ExternalDomain
public class GeoTouchesConverter implements DomainConverter<GeoTouches, String> {

	@Override
	public String fromDomainToValue(GeoTouches domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoTouches fromValueToDomain(String value) {
		return new GEO_TOUCHES(value);
	}

}
