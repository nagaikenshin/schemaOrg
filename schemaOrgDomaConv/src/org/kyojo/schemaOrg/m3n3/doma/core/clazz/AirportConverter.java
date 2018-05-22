package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AIRPORT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Airport;

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
