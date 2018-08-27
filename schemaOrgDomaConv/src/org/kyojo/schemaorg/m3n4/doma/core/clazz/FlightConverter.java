package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FLIGHT;
import org.kyojo.schemaorg.m3n4.core.Clazz.Flight;

@ExternalDomain
public class FlightConverter implements DomainConverter<Flight, String> {

	@Override
	public String fromDomainToValue(Flight domain) {
		return domain.getNativeValue();
	}

	@Override
	public Flight fromValueToDomain(String value) {
		return new FLIGHT(value);
	}

}
