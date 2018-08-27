package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AIRPORT;
import org.kyojo.schemaorg.m3n4.core.Clazz.Airport;

@ExternalDomain
public class AirportConverter implements DomainConverter<Airport, String> {

	@Override
	public String fromDomainToValue(Airport domain) {
		return domain.getNativeValue();
	}

	@Override
	public Airport fromValueToDomain(String value) {
		return new AIRPORT(value);
	}

}
