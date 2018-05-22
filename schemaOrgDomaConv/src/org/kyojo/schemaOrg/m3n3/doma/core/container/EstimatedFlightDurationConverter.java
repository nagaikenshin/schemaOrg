package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ESTIMATED_FLIGHT_DURATION;
import org.kyojo.schemaOrg.m3n3.core.Container.EstimatedFlightDuration;

@ExternalDomain
public class EstimatedFlightDurationConverter implements DomainConverter<EstimatedFlightDuration, String> {

	@Override
	public String fromDomainToValue(EstimatedFlightDuration domain) {
		return domain.getNativeValue();
	}

	@Override
	public EstimatedFlightDuration fromValueToDomain(String value) {
		return new ESTIMATED_FLIGHT_DURATION(value);
	}

}
