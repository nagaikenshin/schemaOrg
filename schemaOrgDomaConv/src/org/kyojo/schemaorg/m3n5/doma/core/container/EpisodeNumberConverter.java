package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.EPISODE_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.EpisodeNumber;

@ExternalDomain
public class EpisodeNumberConverter implements DomainConverter<EpisodeNumber, String> {

	@Override
	public String fromDomainToValue(EpisodeNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public EpisodeNumber fromValueToDomain(String value) {
		return new EPISODE_NUMBER(value);
	}

}
