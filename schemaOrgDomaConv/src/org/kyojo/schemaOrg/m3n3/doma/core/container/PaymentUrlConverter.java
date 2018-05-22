package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAYMENT_URL;
import org.kyojo.schemaOrg.m3n3.core.Container.PaymentUrl;

@ExternalDomain
public class PaymentUrlConverter implements DomainConverter<PaymentUrl, String> {

	@Override
	public String fromDomainToValue(PaymentUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentUrl fromValueToDomain(String value) {
		return new PAYMENT_URL(value);
	}

}
