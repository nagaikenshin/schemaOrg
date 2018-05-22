package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EPISODE_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.EpisodeNumber;

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
