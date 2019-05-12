package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ACCEPTED_PAYMENT_METHOD;
import org.kyojo.schemaorg.m3n5.core.Container.AcceptedPaymentMethod;

@ExternalDomain
public class AcceptedPaymentMethodConverter implements DomainConverter<AcceptedPaymentMethod, String> {

	@Override
	public String fromDomainToValue(AcceptedPaymentMethod domain) {
		return domain.getNativeValue();
	}

	@Override
	public AcceptedPaymentMethod fromValueToDomain(String value) {
		return new ACCEPTED_PAYMENT_METHOD(value);
	}

}
