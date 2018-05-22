package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GAS_STATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GasStation;

@ExternalDomain
public class GasStationConverter implements DomainConverter<GasStation, String> {

	@Override
	public String fromDomainToValue(GasStation domain) {
		return domain.getNativeValue();
	}

	@Override
	public GasStation fromValueToDomain(String value) {
		return new GAS_STATION(value);
	}

}
