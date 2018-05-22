package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GEO_COORDINATES;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GeoCoordinates;

@ExternalDomain
public class GeoCoordinatesConverter implements DomainConverter<GeoCoordinates, String> {

	@Override
	public String fromDomainToValue(GeoCoordinates domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoCoordinates fromValueToDomain(String value) {
		return new GEO_COORDINATES(value);
	}

}
