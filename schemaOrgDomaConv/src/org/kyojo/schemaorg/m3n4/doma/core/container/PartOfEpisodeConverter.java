package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PART_OF_EPISODE;
import org.kyojo.schemaorg.m3n4.core.Container.PartOfEpisode;

@ExternalDomain
public class PartOfEpisodeConverter implements DomainConverter<PartOfEpisode, String> {

	@Override
	public String fromDomainToValue(PartOfEpisode domain) {
		return domain.getNativeValue();
	}

	@Override
	public PartOfEpisode fromValueToDomain(String value) {
		return new PART_OF_EPISODE(value);
	}

}
