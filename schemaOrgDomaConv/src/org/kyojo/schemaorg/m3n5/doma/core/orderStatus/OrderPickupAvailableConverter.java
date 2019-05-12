package org.kyojo.schemaorg.m3n5.doma.core.orderStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.orderStatus.ORDER_PICKUP_AVAILABLE;
import org.kyojo.schemaorg.m3n5.core.OrderStatus.OrderPickupAvailable;

@ExternalDomain
public class OrderPickupAvailableConverter implements DomainConverter<OrderPickupAvailable, String> {

	@Override
	public String fromDomainToValue(OrderPickupAvailable domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderPickupAvailable fromValueToDomain(String value) {
		return new ORDER_PICKUP_AVAILABLE(value);
	}

}
