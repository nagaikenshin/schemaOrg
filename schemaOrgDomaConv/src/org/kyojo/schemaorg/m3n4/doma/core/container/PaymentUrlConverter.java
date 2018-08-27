package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PAYMENT_URL;
import org.kyojo.schemaorg.m3n4.core.Container.PaymentUrl;

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
