package org.kyojo.schemaorg.m3n4.doma.core.paymentStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.paymentStatusType.PAYMENT_DECLINED;
import org.kyojo.schemaorg.m3n4.core.PaymentStatusType.PaymentDeclined;

@ExternalDomain
public class PaymentDeclinedConverter implements DomainConverter<PaymentDeclined, String> {

	@Override
	public String fromDomainToValue(PaymentDeclined domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentDeclined fromValueToDomain(String value) {
		return new PAYMENT_DECLINED(value);
	}

}
