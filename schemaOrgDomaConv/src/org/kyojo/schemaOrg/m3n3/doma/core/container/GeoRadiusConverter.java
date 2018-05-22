package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GEO_RADIUS;
import org.kyojo.schemaOrg.m3n3.core.Container.GeoRadius;

@ExternalDomain
public class GeoRadiusConverter implements DomainConverter<GeoRadius, String> {

	@Override
	public String fromDomainToValue(GeoRadius domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoRadius fromValueToDomain(String value) {
		return new GEO_RADIUS(value);
	}

}
