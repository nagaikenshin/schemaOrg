package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AIRLINE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Airline;

@ExternalDomain
public class AirlineConverter implements DomainConverter<Airline, String> {

	@Override
	public String fromDomainToValue(Airline domain) {
		return domain.getNativeValue();
	}

	@Override
	public Airline fromValueToDomain(String value) {
		return new AIRLINE(value);
	}

}
