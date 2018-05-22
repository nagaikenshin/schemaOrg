package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORDER_ITEM;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OrderItem;

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
