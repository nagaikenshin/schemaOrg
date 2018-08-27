package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ARRIVAL_BUS_STOP;
import org.kyojo.schemaorg.m3n4.core.Container.ArrivalBusStop;

@ExternalDomain
public class ArrivalBusStopConverter implements DomainConverter<ArrivalBusStop, String> {

	@Override
	public String fromDomainToValue(ArrivalBusStop domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArrivalBusStop fromValueToDomain(String value) {
		return new ARRIVAL_BUS_STOP(value);
	}

}
