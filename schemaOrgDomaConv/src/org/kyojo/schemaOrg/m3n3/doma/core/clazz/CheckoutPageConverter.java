package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHECKOUT_PAGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CheckoutPage;

@ExternalDomain
public class CheckoutPageConverter implements DomainConverter<CheckoutPage, String> {

	@Override
	public String fromDomainToValue(CheckoutPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public CheckoutPage fromValueToDomain(String value) {
		return new CHECKOUT_PAGE(value);
	}

}
