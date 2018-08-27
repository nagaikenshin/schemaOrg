package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LONGITUDE;
import org.kyojo.schemaorg.m3n4.core.Container.Longitude;

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
