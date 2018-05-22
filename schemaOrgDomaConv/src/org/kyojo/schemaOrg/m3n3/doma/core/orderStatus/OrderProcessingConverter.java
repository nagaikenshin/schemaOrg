package org.kyojo.schemaOrg.m3n3.doma.core.orderStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.orderStatus.ORDER_PROCESSING;
import org.kyojo.schemaOrg.m3n3.core.OrderStatus.OrderProcessing;

@ExternalDomain
public class OrderProcessingConverter implements DomainConverter<OrderProcessing, String> {

	@Override
	public String fromDomainToValue(OrderProcessing domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderProcessing fromValueToDomain(String value) {
		return new ORDER_PROCESSING(value);
	}

}
