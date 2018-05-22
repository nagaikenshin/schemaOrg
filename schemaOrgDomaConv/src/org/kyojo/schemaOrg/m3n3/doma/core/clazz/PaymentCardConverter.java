package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAYMENT_CARD;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PaymentCard;

@ExternalDomain
public class PaymentCardConverter implements DomainConverter<PaymentCard, String> {

	@Override
	public String fromDomainToValue(PaymentCard domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentCard fromValueToDomain(String value) {
		return new PAYMENT_CARD(value);
	}

}
