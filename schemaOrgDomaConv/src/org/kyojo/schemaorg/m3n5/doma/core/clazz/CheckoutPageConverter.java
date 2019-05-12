package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CHECKOUT_PAGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.CheckoutPage;

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
