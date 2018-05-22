package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAYMENT_DUE_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.PaymentDueDate;

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
