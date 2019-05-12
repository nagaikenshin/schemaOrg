package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GEO_CONTAINS;
import org.kyojo.schemaorg.m3n5.core.Container.GeoContains;

@ExternalDomain
public class GeoContainsConverter implements DomainConverter<GeoContains, String> {

	@Override
	public String fromDomainToValue(GeoContains domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoContains fromValueToDomain(String value) {
		return new GEO_CONTAINS(value);
	}

}
