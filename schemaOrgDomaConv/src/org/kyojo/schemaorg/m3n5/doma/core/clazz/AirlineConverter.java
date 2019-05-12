package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AIRLINE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Airline;

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
