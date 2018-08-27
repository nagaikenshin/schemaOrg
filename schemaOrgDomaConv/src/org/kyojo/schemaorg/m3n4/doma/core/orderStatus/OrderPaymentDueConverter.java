package org.kyojo.schemaorg.m3n4.doma.core.orderStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.orderStatus.ORDER_PAYMENT_DUE;
import org.kyojo.schemaorg.m3n4.core.OrderStatus.OrderPaymentDue;

@ExternalDomain
public class OrderPaymentDueConverter implements DomainConverter<OrderPaymentDue, String> {

	@Override
	public String fromDomainToValue(OrderPaymentDue domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderPaymentDue fromValueToDomain(String value) {
		return new ORDER_PAYMENT_DUE(value);
	}

}