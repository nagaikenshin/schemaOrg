package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_CONTAINS;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyContains;

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
