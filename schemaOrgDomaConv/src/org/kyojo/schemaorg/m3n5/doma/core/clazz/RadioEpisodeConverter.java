package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RADIO_EPISODE;
import org.kyojo.schemaorg.m3n5.core.Clazz.RadioEpisode;

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
