package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_WITHIN;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyWithin;

@ExternalDomain
public class GeospatiallyWithinConverter implements DomainConverter<GeospatiallyWithin, String> {

	@Override
	public String fromDomainToValue(GeospatiallyWithin domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatiallyWithin fromValueToDomain(String value) {
		return new GEOSPATIALLY_WITHIN(value);
	}

}
