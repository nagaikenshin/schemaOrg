package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GEO_OVERLAPS;
import org.kyojo.schemaorg.m3n5.core.Container.GeoOverlaps;

@ExternalDomain
public class GeoOverlapsConverter implements DomainConverter<GeoOverlaps, String> {

	@Override
	public String fromDomainToValue(GeoOverlaps domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoOverlaps fromValueToDomain(String value) {
		return new GEO_OVERLAPS(value);
	}

}
