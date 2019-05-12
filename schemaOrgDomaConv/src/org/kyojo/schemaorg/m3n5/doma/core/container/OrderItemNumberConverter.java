package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ORDER_ITEM_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.OrderItemNumber;

@ExternalDomain
public class OrderItemNumberConverter implements DomainConverter<OrderItemNumber, String> {

	@Override
	public String fromDomainToValue(OrderItemNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderItemNumber fromValueToDomain(String value) {
		return new ORDER_ITEM_NUMBER(value);
	}

}
