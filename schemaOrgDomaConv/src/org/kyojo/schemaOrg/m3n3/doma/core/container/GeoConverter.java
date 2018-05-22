package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GEO;
import org.kyojo.schemaOrg.m3n3.core.Container.Geo;

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
