package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GEOSPATIALLY_TOUCHES;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyTouches;

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
