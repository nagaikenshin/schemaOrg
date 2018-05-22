package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RADIO_EPISODE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RadioEpisode;

@ExternalDomain
public class RadioEpisodeConverter implements DomainConverter<RadioEpisode, String> {

	@Override
	public String fromDomainToValue(RadioEpisode domain) {
		return domain.getNativeValue();
	}

	@Override
	public RadioEpisode fromValueToDomain(String value) {
		return new RADIO_EPISODE(value);
	}

}
