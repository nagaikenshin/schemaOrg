package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PAYMENT_ACCEPTED;
import org.kyojo.schemaorg.m3n4.core.Container.PaymentAccepted;

@ExternalDomain
public class PaymentAcceptedConverter implements DomainConverter<PaymentAccepted, String> {

	@Override
	public String fromDomainToValue(PaymentAccepted domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentAccepted fromValueToDomain(String value) {
		return new PAYMENT_ACCEPTED(value);
	}

}
