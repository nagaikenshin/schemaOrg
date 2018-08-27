package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RADIO_STATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioStation;

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
