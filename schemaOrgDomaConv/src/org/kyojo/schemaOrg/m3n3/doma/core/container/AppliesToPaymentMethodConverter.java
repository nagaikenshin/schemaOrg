package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.APPLIES_TO_PAYMENT_METHOD;
import org.kyojo.schemaOrg.m3n3.core.Container.AppliesToPaymentMethod;

@ExternalDomain
public class AppliesToPaymentMethodConverter implements DomainConverter<AppliesToPaymentMethod, String> {

	@Override
	public String fromDomainToValue(AppliesToPaymentMethod domain) {
		return domain.getNativeValue();
	}

	@Override
	public AppliesToPaymentMethod fromValueToDomain(String value) {
		return new APPLIES_TO_PAYMENT_METHOD(value);
	}

}
