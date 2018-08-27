package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BUS_STATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusStation;

@ExternalDomain
public class BusStationConverter implements DomainConverter<BusStation, String> {

	@Override
	public String fromDomainToValue(BusStation domain) {
		return domain.getNativeValue();
	}

	@Override
	public BusStation fromValueToDomain(String value) {
		return new BUS_STATION(value);
	}

}
