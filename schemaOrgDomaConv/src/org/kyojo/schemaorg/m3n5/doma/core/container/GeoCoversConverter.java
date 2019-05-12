package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GEO_COVERS;
import org.kyojo.schemaorg.m3n5.core.Container.GeoCovers;

@ExternalDomain
public class GeoCoversConverter implements DomainConverter<GeoCovers, String> {

	@Override
	public String fromDomainToValue(GeoCovers domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoCovers fromValueToDomain(String value) {
		return new GEO_COVERS(value);
	}

}
