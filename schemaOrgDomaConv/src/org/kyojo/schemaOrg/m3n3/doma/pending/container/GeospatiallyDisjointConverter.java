package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GEOSPATIALLY_DISJOINT;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyDisjoint;

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
