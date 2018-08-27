package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PAYMENT_STATUS;
import org.kyojo.schemaorg.m3n4.core.Container.PaymentStatus;

@ExternalDomain
public class PaymentStatusConverter implements DomainConverter<PaymentStatus, String> {

	@Override
	public String fromDomainToValue(PaymentStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentStatus fromValueToDomain(String value) {
		return new PAYMENT_STATUS(value);
	}

}
