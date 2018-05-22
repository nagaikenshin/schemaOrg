package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EPISODE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Episode;

@ExternalDomain
public class EpisodeConverter implements DomainConverter<Episode, String> {

	@Override
	public String fromDomainToValue(Episode domain) {
		return domain.getNativeValue();
	}

	@Override
	public Episode fromValueToDomain(String value) {
		return new EPISODE(value);
	}

}
