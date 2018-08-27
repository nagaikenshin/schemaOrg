package org.kyojo.schemaorg.m3n4.doma.core.paymentStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.paymentStatusType.PAYMENT_PAST_DUE;
import org.kyojo.schemaorg.m3n4.core.PaymentStatusType.PaymentPastDue;

@ExternalDomain
public class PaymentPastDueConverter implements DomainConverter<PaymentPastDue, String> {

	@Override
	public String fromDomainToValue(PaymentPastDue domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentPastDue fromValueToDomain(String value) {
		return new PAYMENT_PAST_DUE(value);
	}

}
