package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPARTURE_BUS_STOP;
import org.kyojo.schemaOrg.m3n3.core.Container.DepartureBusStop;

@ExternalDomain
public class DepartureBusStopConverter implements DomainConverter<DepartureBusStop, String> {

	@Override
	public String fromDomainToValue(DepartureBusStop domain) {
		return domain.getNativeValue();
	}

	@Override
	public DepartureBusStop fromValueToDomain(String value) {
		return new DEPARTURE_BUS_STOP(value);
	}

}
