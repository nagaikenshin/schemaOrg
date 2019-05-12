package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BUS_TRIP;
import org.kyojo.schemaorg.m3n5.core.Clazz.BusTrip;

@ExternalDomain
public class BusTripConverter implements DomainConverter<BusTrip, String> {

	@Override
	public String fromDomainToValue(BusTrip domain) {
		return domain.getNativeValue();
	}

	@Override
	public BusTrip fromValueToDomain(String value) {
		return new BUS_TRIP(value);
	}

}
