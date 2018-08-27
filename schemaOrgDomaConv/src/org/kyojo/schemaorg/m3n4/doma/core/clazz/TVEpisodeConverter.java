package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TV_EPISODE;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVEpisode;

@ExternalDomain
public class TVEpisodeConverter implements DomainConverter<TVEpisode, String> {

	@Override
	public String fromDomainToValue(TVEpisode domain) {
		return domain.getNativeValue();
	}

	@Override
	public TVEpisode fromValueToDomain(String value) {
		return new TV_EPISODE(value);
	}

}
