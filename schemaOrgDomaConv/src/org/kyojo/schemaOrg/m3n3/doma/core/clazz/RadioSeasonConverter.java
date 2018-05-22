package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RADIO_SEASON;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RadioSeason;

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
