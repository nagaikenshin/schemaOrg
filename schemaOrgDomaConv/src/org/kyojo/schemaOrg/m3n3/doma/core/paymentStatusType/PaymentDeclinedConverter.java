package org.kyojo.schemaOrg.m3n3.doma.core.paymentStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.paymentStatusType.PAYMENT_DECLINED;
import org.kyojo.schemaOrg.m3n3.core.PaymentStatusType.PaymentDeclined;

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
