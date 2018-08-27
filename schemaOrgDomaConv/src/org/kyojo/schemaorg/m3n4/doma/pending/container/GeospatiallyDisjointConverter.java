package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_DISJOINT;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyDisjoint;

@ExternalDomain
public class GeospatiallyDisjointConverter implements DomainConverter<GeospatiallyDisjoint, String> {

	@Override
	public String fromDomainToValue(GeospatiallyDisjoint domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatiallyDisjoint fromValueToDomain(String value) {
		return new GEOSPATIALLY_DISJOINT(value);
	}

}
