package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ELEVATION;
import org.kyojo.schemaOrg.m3n3.core.Container.Elevation;

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
