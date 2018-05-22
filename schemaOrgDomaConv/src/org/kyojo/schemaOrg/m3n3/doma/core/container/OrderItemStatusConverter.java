package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORDER_ITEM_STATUS;
import org.kyojo.schemaOrg.m3n3.core.Container.OrderItemStatus;

@ExternalDomain
public class OrderItemStatusConverter implements DomainConverter<OrderItemStatus, String> {

	@Override
	public String fromDomainToValue(OrderItemStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderItemStatus fromValueToDomain(String value) {
		return new ORDER_ITEM_STATUS(value);
	}

}
