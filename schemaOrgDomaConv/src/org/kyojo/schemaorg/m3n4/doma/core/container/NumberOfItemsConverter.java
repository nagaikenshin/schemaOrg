package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_ITEMS;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfItems;

@ExternalDomain
public class NumberOfItemsConverter implements DomainConverter<NumberOfItems, Long> {

	@Override
	public Long fromDomainToValue(NumberOfItems domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfItems fromValueToDomain(Long value) {
		return new NUMBER_OF_ITEMS(value);
	}

}
