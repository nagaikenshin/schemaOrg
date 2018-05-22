package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BUS_STOP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BusStop;

@ExternalDomain
public class BusStopConverter implements DomainConverter<BusStop, String> {

	@Override
	public String fromDomainToValue(BusStop domain) {
		return domain.getNativeValue();
	}

	@Override
	public BusStop fromValueToDomain(String value) {
		return new BUS_STOP(value);
	}

}
