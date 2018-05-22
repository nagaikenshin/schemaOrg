package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NUMBER_OF_EPISODES;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfEpisodes;

@ExternalDomain
public class NumberOfEpisodesConverter implements DomainConverter<NumberOfEpisodes, Long> {

	@Override
	public Long fromDomainToValue(NumberOfEpisodes domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfEpisodes fromValueToDomain(Long value) {
		return new NUMBER_OF_EPISODES(value);
	}

}
