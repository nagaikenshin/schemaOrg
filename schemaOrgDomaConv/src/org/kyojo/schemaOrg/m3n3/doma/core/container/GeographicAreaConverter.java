package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GEOGRAPHIC_AREA;
import org.kyojo.schemaOrg.m3n3.core.Container.GeographicArea;

@ExternalDomain
public class GeographicAreaConverter implements DomainConverter<GeographicArea, String> {

	@Override
	public String fromDomainToValue(GeographicArea domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeographicArea fromValueToDomain(String value) {
		return new GEOGRAPHIC_AREA(value);
	}

}
