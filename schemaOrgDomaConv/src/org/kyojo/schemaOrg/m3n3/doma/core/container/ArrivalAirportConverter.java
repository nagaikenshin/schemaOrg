package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ARRIVAL_AIRPORT;
import org.kyojo.schemaOrg.m3n3.core.Container.ArrivalAirport;

@ExternalDomain
public class ArrivalAirportConverter implements DomainConverter<ArrivalAirport, String> {

	@Override
	public String fromDomainToValue(ArrivalAirport domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArrivalAirport fromValueToDomain(String value) {
		return new ARRIVAL_AIRPORT(value);
	}

}
