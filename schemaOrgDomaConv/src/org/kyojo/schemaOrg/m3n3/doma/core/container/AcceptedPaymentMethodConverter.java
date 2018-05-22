package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCEPTED_PAYMENT_METHOD;
import org.kyojo.schemaOrg.m3n3.core.Container.AcceptedPaymentMethod;

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
