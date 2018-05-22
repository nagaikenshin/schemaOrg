package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORDERED_ITEM;
import org.kyojo.schemaOrg.m3n3.core.Container.OrderedItem;

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
