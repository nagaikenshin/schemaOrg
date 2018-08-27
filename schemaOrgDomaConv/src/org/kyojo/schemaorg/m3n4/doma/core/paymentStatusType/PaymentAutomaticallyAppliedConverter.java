package org.kyojo.schemaorg.m3n4.doma.core.paymentStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.paymentStatusType.PAYMENT_AUTOMATICALLY_APPLIED;
import org.kyojo.schemaorg.m3n4.core.PaymentStatusType.PaymentAutomaticallyApplied;

@ExternalDomain
public class PaymentAutomaticallyAppliedConverter implements DomainConverter<PaymentAutomaticallyApplied, String> {

	@Override
	public String fromDomainToValue(PaymentAutomaticallyApplied domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentAutomaticallyApplied fromValueToDomain(String value) {
		return new PAYMENT_AUTOMATICALLY_APPLIED(value);
	}

}
