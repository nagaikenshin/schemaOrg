package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NUMBER_OF_SEASONS;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfSeasons;

@ExternalDomain
public class NumberOfSeasonsConverter implements DomainConverter<NumberOfSeasons, Long> {

	@Override
	public Long fromDomainToValue(NumberOfSeasons domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfSeasons fromValueToDomain(Long value) {
		return new NUMBER_OF_SEASONS(value);
	}

}
