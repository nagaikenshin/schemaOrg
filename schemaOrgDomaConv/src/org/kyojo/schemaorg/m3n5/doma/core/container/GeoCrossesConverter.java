package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GEO_CROSSES;
import org.kyojo.schemaorg.m3n5.core.Container.GeoCrosses;

@ExternalDomain
public class GeoCrossesConverter implements DomainConverter<GeoCrosses, String> {

	@Override
	public String fromDomainToValue(GeoCrosses domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeoCrosses fromValueToDomain(String value) {
		return new GEO_CROSSES(value);
	}

}
