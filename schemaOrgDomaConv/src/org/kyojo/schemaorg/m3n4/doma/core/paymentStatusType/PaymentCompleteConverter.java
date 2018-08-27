package org.kyojo.schemaorg.m3n4.doma.core.paymentStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.paymentStatusType.PAYMENT_COMPLETE;
import org.kyojo.schemaorg.m3n4.core.PaymentStatusType.PaymentComplete;

@ExternalDomain
public class PaymentCompleteConverter implements DomainConverter<PaymentComplete, String> {

	@Override
	public String fromDomainToValue(PaymentComplete domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentComplete fromValueToDomain(String value) {
		return new PAYMENT_COMPLETE(value);
	}

}
