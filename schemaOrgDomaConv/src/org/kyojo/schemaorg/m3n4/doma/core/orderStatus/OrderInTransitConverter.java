package org.kyojo.schemaorg.m3n4.doma.core.orderStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.orderStatus.ORDER_IN_TRANSIT;
import org.kyojo.schemaorg.m3n4.core.OrderStatus.OrderInTransit;

@ExternalDomain
public class OrderInTransitConverter implements DomainConverter<OrderInTransit, String> {

	@Override
	public String fromDomainToValue(OrderInTransit domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderInTransit fromValueToDomain(String value) {
		return new ORDER_IN_TRANSIT(value);
	}

}
