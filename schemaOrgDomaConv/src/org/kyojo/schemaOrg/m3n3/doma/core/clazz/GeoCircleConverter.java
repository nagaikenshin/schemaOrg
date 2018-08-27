package org.kyojo.schemaorg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.core.impl.GEO_CIRCLE;
import org.kyojo.schemaorg.m3n3.core.Clazz.GeoCircle;

@ExternalDomain
public class GeoCircleConverter implements DomainConverter<GeoCircle, String> {

	@Override
	public String fromDomainToValue(GeoCircle domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoCircle fromValueToDomain(String value) {
		return new GEO_CIRCLE(value);
	}

}
