package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GEO_MIDPOINT;
import org.kyojo.schemaorg.m3n4.core.Container.GeoMidpoint;

@ExternalDomain
public class GeoMidpointConverter implements DomainConverter<GeoMidpoint, String> {

	@Override
	public String fromDomainToValue(GeoMidpoint domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoMidpoint fromValueToDomain(String value) {
		return new GEO_MIDPOINT(value);
	}

}
