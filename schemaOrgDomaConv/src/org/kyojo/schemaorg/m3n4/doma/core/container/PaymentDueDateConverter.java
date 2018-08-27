package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PAYMENT_DUE_DATE;
import org.kyojo.schemaorg.m3n4.core.Container.PaymentDueDate;

@ExternalDomain
public class PaymentDueDateConverter implements DomainConverter<PaymentDueDate, Date> {

	@Override
	public Date fromDomainToValue(PaymentDueDate domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentDueDate fromValueToDomain(Date value) {
		return new PAYMENT_DUE_DATE(value);
	}

}