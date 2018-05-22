package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PART_OF_SEASON;
import org.kyojo.schemaOrg.m3n3.core.Container.PartOfSeason;

@ExternalDomain
public class PartOfSeasonConverter implements DomainConverter<PartOfSeason, String> {

	@Override
	public String fromDomainToValue(PartOfSeason domain) {
		return domain.getNativeValue();
	}

	@Override
	public PartOfSeason fromValueToDomain(String value) {
		return new PART_OF_SEASON(value);
	}

}
