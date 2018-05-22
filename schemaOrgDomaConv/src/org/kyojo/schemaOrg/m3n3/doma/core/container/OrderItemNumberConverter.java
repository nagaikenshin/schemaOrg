package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORDER_ITEM_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.OrderItemNumber;

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
