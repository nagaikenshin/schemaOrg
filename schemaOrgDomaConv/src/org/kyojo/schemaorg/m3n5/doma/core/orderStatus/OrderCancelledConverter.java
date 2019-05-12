package org.kyojo.schemaorg.m3n5.doma.core.orderStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.orderStatus.ORDER_CANCELLED;
import org.kyojo.schemaorg.m3n5.core.OrderStatus.OrderCancelled;

@ExternalDomain
public class OrderCancelledConverter implements DomainConverter<OrderCancelled, String> {

	@Override
	public String fromDomainToValue(OrderCancelled domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderCancelled fromValueToDomain(String value) {
		return new ORDER_CANCELLED(value);
	}

}
