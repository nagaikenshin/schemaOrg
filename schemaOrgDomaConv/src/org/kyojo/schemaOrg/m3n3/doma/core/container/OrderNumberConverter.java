package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORDER_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.OrderNumber;

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
