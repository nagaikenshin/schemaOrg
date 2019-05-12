package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GEO_EQUALS;
import org.kyojo.schemaorg.m3n5.core.Container.GeoEquals;

@ExternalDomain
public class GeoEqualsConverter implements DomainConverter<GeoEquals, String> {

	@Override
	public String fromDomainToValue(GeoEquals domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoEquals fromValueToDomain(String value) {
		return new GEO_EQUALS(value);
	}

}
