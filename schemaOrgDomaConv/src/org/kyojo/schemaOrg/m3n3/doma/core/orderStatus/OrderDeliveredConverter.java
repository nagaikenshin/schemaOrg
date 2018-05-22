package org.kyojo.schemaOrg.m3n3.doma.core.orderStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.orderStatus.ORDER_DELIVERED;
import org.kyojo.schemaOrg.m3n3.core.OrderStatus.OrderDelivered;

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
