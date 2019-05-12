package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TV_SEASON;
import org.kyojo.schemaorg.m3n5.core.Clazz.TVSeason;

@ExternalDomain
public class TVSeasonConverter implements DomainConverter<TVSeason, String> {

	@Override
	public String fromDomainToValue(TVSeason domain) {
		return domain.getNativeValue();
	}

	@Override
	public TVSeason fromValueToDomain(String value) {
		return new TV_SEASON(value);
	}

}
