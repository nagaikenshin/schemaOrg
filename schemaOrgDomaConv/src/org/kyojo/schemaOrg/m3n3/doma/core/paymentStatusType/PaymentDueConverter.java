package org.kyojo.schemaOrg.m3n3.doma.core.paymentStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.paymentStatusType.PAYMENT_DUE;
import org.kyojo.schemaOrg.m3n3.core.PaymentStatusType.PaymentDue;

@ExternalDomain
public class PaymentDueConverter implements DomainConverter<PaymentDue, String> {

	@Override
	public String fromDomainToValue(PaymentDue domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentDue fromValueToDomain(String value) {
		return new PAYMENT_DUE(value);
	}

}
