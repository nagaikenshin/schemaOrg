package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CREATIVE_WORK_SEASON;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWorkSeason;

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
