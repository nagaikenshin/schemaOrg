package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.POLYGON;
import org.kyojo.schemaOrg.m3n3.core.Container.Polygon;

@ExternalDomain
public class PolygonConverter implements DomainConverter<Polygon, String> {

	@Override
	public String fromDomainToValue(Polygon domain) {
		return domain.getNativeValue();
	}

	@Override
	public Polygon fromValueToDomain(String value) {
		return new POLYGON(value);
	}

}
