package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ORDERED_ITEM;
import org.kyojo.schemaorg.m3n4.core.Container.OrderedItem;

@ExternalDomain
public class OrderedItemConverter implements DomainConverter<OrderedItem, String> {

	@Override
	public String fromDomainToValue(OrderedItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderedItem fromValueToDomain(String value) {
		return new ORDERED_ITEM(value);
	}

}
