package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GEOSPATIALLY_EQUALS;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyEquals;

@ExternalDomain
public class GeospatiallyEqualsConverter implements DomainConverter<GeospatiallyEquals, String> {

	@Override
	public String fromDomainToValue(GeospatiallyEquals domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatiallyEquals fromValueToDomain(String value) {
		return new GEOSPATIALLY_EQUALS(value);
	}

}
