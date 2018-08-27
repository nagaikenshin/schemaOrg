package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PART_OF_SEASON;
import org.kyojo.schemaorg.m3n4.core.Container.PartOfSeason;

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
