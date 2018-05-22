package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LONGITUDE;
import org.kyojo.schemaOrg.m3n3.core.Container.Longitude;

@ExternalDomain
public class LongitudeConverter implements DomainConverter<Longitude, String> {

	@Override
	public String fromDomainToValue(Longitude domain) {
		return domain.getNativeValue();
	}

	@Override
	public Longitude fromValueToDomain(String value) {
		return new LONGITUDE(value);
	}

}
