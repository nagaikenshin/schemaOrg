package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAYMENT_METHOD_ID;
import org.kyojo.schemaOrg.m3n3.core.Container.PaymentMethodId;

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
