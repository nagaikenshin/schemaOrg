package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORDER_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.OrderDate;

@ExternalDomain
public class OrderDateConverter implements DomainConverter<OrderDate, Date> {

	@Override
	public Date fromDomainToValue(OrderDate domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderDate fromValueToDomain(Date value) {
		return new ORDER_DATE(value);
	}

}
