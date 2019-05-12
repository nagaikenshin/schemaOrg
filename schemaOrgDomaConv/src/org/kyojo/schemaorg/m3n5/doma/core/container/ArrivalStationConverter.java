package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ARRIVAL_STATION;
import org.kyojo.schemaorg.m3n5.core.Container.ArrivalStation;

@ExternalDomain
public class ArrivalStationConverter implements DomainConverter<ArrivalStation, String> {

	@Override
	public String fromDomainToValue(ArrivalStation domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArrivalStation fromValueToDomain(String value) {
		return new ARRIVAL_STATION(value);
	}

}
