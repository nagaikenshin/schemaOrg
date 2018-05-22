package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ARRIVAL_BUS_STOP;
import org.kyojo.schemaOrg.m3n3.core.Container.ArrivalBusStop;

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
