package org.kyojo.schemaorg.m3n5.doma.core.orderStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.orderStatus.ORDER_DELIVERED;
import org.kyojo.schemaorg.m3n5.core.OrderStatus.OrderDelivered;

@ExternalDomain
public class OrderDeliveredConverter implements DomainConverter<OrderDelivered, String> {

	@Override
	public String fromDomainToValue(OrderDelivered domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderDelivered fromValueToDomain(String value) {
		return new ORDER_DELIVERED(value);
	}

}
