package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORDER_DELIVERY;
import org.kyojo.schemaOrg.m3n3.core.Container.OrderDelivery;

@ExternalDomain
public class OrderDeliveryConverter implements DomainConverter<OrderDelivery, String> {

	@Override
	public String fromDomainToValue(OrderDelivery domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderDelivery fromValueToDomain(String value) {
		return new ORDER_DELIVERY(value);
	}

}
