package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FLIGHT_DISTANCE;
import org.kyojo.schemaOrg.m3n3.core.Container.FlightDistance;

@ExternalDomain
public class FlightDistanceConverter implements DomainConverter<FlightDistance, String> {

	@Override
	public String fromDomainToValue(FlightDistance domain) {
		return domain.getNativeValue();
	}

	@Override
	public FlightDistance fromValueToDomain(String value) {
		return new FLIGHT_DISTANCE(value);
	}

}
