package org.kyojo.schemaOrg.m3n3.doma.core.orderStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.orderStatus.ORDER_RETURNED;
import org.kyojo.schemaOrg.m3n3.core.OrderStatus.OrderReturned;

@ExternalDomain
public class OrderReturnedConverter implements DomainConverter<OrderReturned, String> {

	@Override
	public String fromDomainToValue(OrderReturned domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderReturned fromValueToDomain(String value) {
		return new ORDER_RETURNED(value);
	}

}
