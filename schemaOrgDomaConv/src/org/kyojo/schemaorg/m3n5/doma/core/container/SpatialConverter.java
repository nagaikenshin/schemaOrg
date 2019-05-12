package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SPATIAL;
import org.kyojo.schemaorg.m3n5.core.Container.Spatial;

@ExternalDomain
public class SpatialConverter implements DomainConverter<Spatial, String> {

	@Override
	public String fromDomainToValue(Spatial domain) {
		return domain.getNativeValue();
	}

	@Override
	public Spatial fromValueToDomain(String value) {
		return new SPATIAL(value);
	}

}
