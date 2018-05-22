package org.kyojo.schemaOrg.m3n3.doma.core.orderStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.orderStatus.ORDER_IN_TRANSIT;
import org.kyojo.schemaOrg.m3n3.core.OrderStatus.OrderInTransit;

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
