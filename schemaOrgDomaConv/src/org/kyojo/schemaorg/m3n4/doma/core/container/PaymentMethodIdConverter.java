package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PAYMENT_METHOD_ID;
import org.kyojo.schemaorg.m3n4.core.Container.PaymentMethodId;

@ExternalDomain
public class PaymentMethodIdConverter implements DomainConverter<PaymentMethodId, String> {

	@Override
	public String fromDomainToValue(PaymentMethodId domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentMethodId fromValueToDomain(String value) {
		return new PAYMENT_METHOD_ID(value);
	}

}
