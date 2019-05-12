package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ARRIVAL_AIRPORT;
import org.kyojo.schemaorg.m3n5.core.Container.ArrivalAirport;

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
