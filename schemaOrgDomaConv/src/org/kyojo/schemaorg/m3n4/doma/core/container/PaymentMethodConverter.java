package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PAYMENT_METHOD;
import org.kyojo.schemaorg.m3n4.core.Container.PaymentMethod;

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
