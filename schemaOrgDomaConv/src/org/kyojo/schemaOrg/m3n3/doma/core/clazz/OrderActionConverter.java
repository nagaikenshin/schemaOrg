package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORDER_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OrderAction;

@ExternalDomain
public class OrderActionConverter implements DomainConverter<OrderAction, String> {

	@Override
	public String fromDomainToValue(OrderAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderAction fromValueToDomain(String value) {
		return new ORDER_ACTION(value);
	}

}
