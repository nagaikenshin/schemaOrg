package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CREATIVE_WORK_SEASON;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWorkSeason;

@ExternalDomain
public class CreativeWorkSeasonConverter implements DomainConverter<CreativeWorkSeason, String> {

	@Override
	public String fromDomainToValue(CreativeWorkSeason domain) {
		return domain.getNativeValue();
	}

	@Override
	public CreativeWorkSeason fromValueToDomain(String value) {
		return new CREATIVE_WORK_SEASON(value);
	}

}
