package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FIRE_STATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.FireStation;

@ExternalDomain
public class FireStationConverter implements DomainConverter<FireStation, String> {

	@Override
	public String fromDomainToValue(FireStation domain) {
		return domain.getNativeValue();
	}

	@Override
	public FireStation fromValueToDomain(String value) {
		return new FIRE_STATION(value);
	}

}
