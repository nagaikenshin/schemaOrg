package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PAYMENT_STATUS_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentStatusType;

@ExternalDomain
public class PaymentStatusTypeConverter implements DomainConverter<PaymentStatusType, String> {

	@Override
	public String fromDomainToValue(PaymentStatusType domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentStatusType fromValueToDomain(String value) {
		return new PAYMENT_STATUS_TYPE(value);
	}

}
