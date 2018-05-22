package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FIRE_STATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.FireStation;

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
