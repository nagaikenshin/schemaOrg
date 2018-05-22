package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORDER_QUANTITY;
import org.kyojo.schemaOrg.m3n3.core.Container.OrderQuantity;

@ExternalDomain
public class OrderQuantityConverter implements DomainConverter<OrderQuantity, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(OrderQuantity domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrderQuantity fromValueToDomain(BigDecimal value) {
		return new ORDER_QUANTITY(value);
	}

}
