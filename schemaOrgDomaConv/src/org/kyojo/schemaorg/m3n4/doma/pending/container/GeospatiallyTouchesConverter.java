package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_TOUCHES;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyTouches;

@ExternalDomain
public class GeospatiallyTouchesConverter implements DomainConverter<GeospatiallyTouches, String> {

	@Override
	public String fromDomainToValue(GeospatiallyTouches domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatiallyTouches fromValueToDomain(String value) {
		return new GEOSPATIALLY_TOUCHES(value);
	}

}
