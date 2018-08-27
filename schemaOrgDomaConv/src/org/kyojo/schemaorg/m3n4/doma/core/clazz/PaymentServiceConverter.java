package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PAYMENT_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentService;

@ExternalDomain
public class PaymentServiceConverter implements DomainConverter<PaymentService, String> {

	@Override
	public String fromDomainToValue(PaymentService domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentService fromValueToDomain(String value) {
		return new PAYMENT_SERVICE(value);
	}

}
