package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GEO_DISJOINT;
import org.kyojo.schemaorg.m3n5.core.Container.GeoDisjoint;

@ExternalDomain
public class GeoDisjointConverter implements DomainConverter<GeoDisjoint, String> {

	@Override
	public String fromDomainToValue(GeoDisjoint domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoDisjoint fromValueToDomain(String value) {
		return new GEO_DISJOINT(value);
	}

}
