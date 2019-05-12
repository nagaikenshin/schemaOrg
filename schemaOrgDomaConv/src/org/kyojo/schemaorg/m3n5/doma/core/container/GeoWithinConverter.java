package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GEO_WITHIN;
import org.kyojo.schemaorg.m3n5.core.Container.GeoWithin;

@ExternalDomain
public class GeoWithinConverter implements DomainConverter<GeoWithin, String> {

	@Override
	public String fromDomainToValue(GeoWithin domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoWithin fromValueToDomain(String value) {
		return new GEO_WITHIN(value);
	}

}
