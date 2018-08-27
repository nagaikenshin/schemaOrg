package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_PAGES;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfPages;

@ExternalDomain
public class NumberOfPagesConverter implements DomainConverter<NumberOfPages, Long> {

	@Override
	public Long fromDomainToValue(NumberOfPages domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfPages fromValueToDomain(Long value) {
		return new NUMBER_OF_PAGES(value);
	}

}
