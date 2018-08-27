package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ELEVATION;
import org.kyojo.schemaorg.m3n4.core.Container.Elevation;

@ExternalDomain
public class ElevationConverter implements DomainConverter<Elevation, String> {

	@Override
	public String fromDomainToValue(Elevation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Elevation fromValueToDomain(String value) {
		return new ELEVATION(value);
	}

}
