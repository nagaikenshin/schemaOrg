package org.kyojo.schemaorg.m3n5.doma.core.orderStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.orderStatus.ORDER_PROCESSING;
import org.kyojo.schemaorg.m3n5.core.OrderStatus.OrderProcessing;

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
