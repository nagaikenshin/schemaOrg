package org.kyojo.schemaOrg.m3n3.doma.core.paymentStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.paymentStatusType.PAYMENT_COMPLETE;
import org.kyojo.schemaOrg.m3n3.core.PaymentStatusType.PaymentComplete;

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
