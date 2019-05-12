package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DEPARTURE_BUS_STOP;
import org.kyojo.schemaorg.m3n5.core.Container.DepartureBusStop;

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
