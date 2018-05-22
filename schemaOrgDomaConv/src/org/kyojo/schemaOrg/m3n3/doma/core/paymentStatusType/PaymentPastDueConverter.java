package org.kyojo.schemaOrg.m3n3.doma.core.paymentStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.paymentStatusType.PAYMENT_PAST_DUE;
import org.kyojo.schemaOrg.m3n3.core.PaymentStatusType.PaymentPastDue;

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
