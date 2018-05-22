package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LATITUDE;
import org.kyojo.schemaOrg.m3n3.core.Container.Latitude;

@ExternalDomain
public class LatitudeConverter implements DomainConverter<Latitude, String> {

	@Override
	public String fromDomainToValue(Latitude domain) {
		return domain.getNativeValue();
	}

	@Override
	public Latitude fromValueToDomain(String value) {
		return new LATITUDE(value);
	}

}
