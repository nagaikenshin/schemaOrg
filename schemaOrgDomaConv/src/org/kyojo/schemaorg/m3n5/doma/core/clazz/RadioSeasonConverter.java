package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RADIO_SEASON;
import org.kyojo.schemaorg.m3n5.core.Clazz.RadioSeason;

@ExternalDomain
public class RadioSeasonConverter implements DomainConverter<RadioSeason, String> {

	@Override
	public String fromDomainToValue(RadioSeason domain) {
		return domain.getNativeValue();
	}

	@Override
	public RadioSeason fromValueToDomain(String value) {
		return new RADIO_SEASON(value);
	}

}
