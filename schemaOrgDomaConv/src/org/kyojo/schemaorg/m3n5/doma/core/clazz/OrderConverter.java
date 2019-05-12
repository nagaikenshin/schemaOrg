package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ORDER;
import org.kyojo.schemaorg.m3n5.core.Clazz.Order;

@ExternalDomain
public class OrderConverter implements DomainConverter<Order, String> {

	@Override
	public String fromDomainToValue(Order domain) {
		return domain.getNativeValue();
	}

	@Override
	public Order fromValueToDomain(String value) {
		return new ORDER(value);
	}

}