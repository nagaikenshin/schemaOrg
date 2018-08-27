package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ORDER_STATUS;
import org.kyojo.schemaorg.m3n4.core.Clazz.OrderStatus;

@ExternalDomain
public class OrderStatusConverter implements DomainConverter<OrderStatus, String> {

	@Override
	public String fromDomainToValue(OrderStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderStatus fromValueToDomain(String value) {
		return new ORDER_STATUS(value);
	}

}
