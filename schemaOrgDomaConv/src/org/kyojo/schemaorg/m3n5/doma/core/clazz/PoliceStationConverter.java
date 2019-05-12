package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.POLICE_STATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.PoliceStation;

@ExternalDomain
public class PoliceStationConverter implements DomainConverter<PoliceStation, String> {

	@Override
	public String fromDomainToValue(PoliceStation domain) {
		return domain.getNativeValue();
	}

	@Override
	public PoliceStation fromValueToDomain(String value) {
		return new POLICE_STATION(value);
	}

}
