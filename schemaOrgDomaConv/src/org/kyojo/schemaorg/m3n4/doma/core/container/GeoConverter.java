package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GEO;
import org.kyojo.schemaorg.m3n4.core.Container.Geo;

@ExternalDomain
public class GeoConverter implements DomainConverter<Geo, String> {

	@Override
	public String fromDomainToValue(Geo domain) {
		return domain.getNativeValue();
	}

	@Override
	public Geo fromValueToDomain(String value) {
		return new GEO(value);
	}

}
