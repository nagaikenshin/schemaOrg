package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RADIO_STATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RadioStation;

@ExternalDomain
public class RadioStationConverter implements DomainConverter<RadioStation, String> {

	@Override
	public String fromDomainToValue(RadioStation domain) {
		return domain.getNativeValue();
	}

	@Override
	public RadioStation fromValueToDomain(String value) {
		return new RADIO_STATION(value);
	}

}
