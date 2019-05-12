package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ORDER_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.OrderNumber;

@ExternalDomain
public class OrderNumberConverter implements DomainConverter<OrderNumber, String> {

	@Override
	public String fromDomainToValue(OrderNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderNumber fromValueToDomain(String value) {
		return new ORDER_NUMBER(value);
	}

}
