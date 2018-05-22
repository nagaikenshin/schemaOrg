package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NUMBER_OF_SEASONS;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfSeasons;

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
