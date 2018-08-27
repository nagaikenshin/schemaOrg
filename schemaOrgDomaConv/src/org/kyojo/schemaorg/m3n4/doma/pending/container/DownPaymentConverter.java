package org.kyojo.schemaorg.m3n4.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.DOWN_PAYMENT;
import org.kyojo.schemaorg.m3n4.pending.Container.DownPayment;

@ExternalDomain
public class DownPaymentConverter implements DomainConverter<DownPayment, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(DownPayment domain) {
		return domain.getNativeValue();
	}

	@Override
	public DownPayment fromValueToDomain(BigDecimal value) {
		return new DOWN_PAYMENT(value);
	}

}
