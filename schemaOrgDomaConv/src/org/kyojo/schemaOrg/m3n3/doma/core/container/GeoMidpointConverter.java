package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GEO_MIDPOINT;
import org.kyojo.schemaOrg.m3n3.core.Container.GeoMidpoint;

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
