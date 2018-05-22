package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAYMENT_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PaymentService;

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
