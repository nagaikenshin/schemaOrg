package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAYMENT_METHOD;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PaymentMethod;

@ExternalDomain
public class PaymentMethodConverter implements DomainConverter<PaymentMethod, String> {

	@Override
	public String fromDomainToValue(PaymentMethod domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentMethod fromValueToDomain(String value) {
		return new PAYMENT_METHOD(value);
	}

}
