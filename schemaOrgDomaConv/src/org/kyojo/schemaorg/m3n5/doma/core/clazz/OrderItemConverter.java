package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ORDER_ITEM;
import org.kyojo.schemaorg.m3n5.core.Clazz.OrderItem;

@ExternalDomain
public class OrderItemConverter implements DomainConverter<OrderItem, String> {

	@Override
	public String fromDomainToValue(OrderItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderItem fromValueToDomain(String value) {
		return new ORDER_ITEM(value);
	}

}
