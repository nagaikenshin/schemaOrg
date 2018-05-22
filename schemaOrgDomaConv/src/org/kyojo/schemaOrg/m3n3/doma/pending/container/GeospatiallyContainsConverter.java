package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GEOSPATIALLY_CONTAINS;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyContains;

@ExternalDomain
public class GeospatiallyContainsConverter implements DomainConverter<GeospatiallyContains, String> {

	@Override
	public String fromDomainToValue(GeospatiallyContains domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatiallyContains fromValueToDomain(String value) {
		return new GEOSPATIALLY_CONTAINS(value);
	}

}
