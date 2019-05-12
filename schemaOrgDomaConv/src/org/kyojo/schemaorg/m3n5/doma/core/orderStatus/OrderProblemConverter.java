package org.kyojo.schemaorg.m3n5.doma.core.orderStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.orderStatus.ORDER_PROBLEM;
import org.kyojo.schemaorg.m3n5.core.OrderStatus.OrderProblem;

@ExternalDomain
public class OrderProblemConverter implements DomainConverter<OrderProblem, String> {

	@Override
	public String fromDomainToValue(OrderProblem domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderProblem fromValueToDomain(String value) {
		return new ORDER_PROBLEM(value);
	}

}