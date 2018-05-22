package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TV_EPISODE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TVEpisode;

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
