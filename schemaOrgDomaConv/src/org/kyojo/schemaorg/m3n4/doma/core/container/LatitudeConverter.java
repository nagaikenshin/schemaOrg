package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LATITUDE;
import org.kyojo.schemaorg.m3n4.core.Container.Latitude;

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
