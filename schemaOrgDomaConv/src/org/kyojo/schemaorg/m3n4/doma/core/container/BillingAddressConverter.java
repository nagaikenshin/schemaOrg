package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BILLING_ADDRESS;
import org.kyojo.schemaorg.m3n4.core.Container.BillingAddress;

@ExternalDomain
public class BillingAddressConverter implements DomainConverter<BillingAddress, String> {

	@Override
	public String fromDomainToValue(BillingAddress domain) {
		return domain.getNativeValue();
	}

	@Override
	public BillingAddress fromValueToDomain(String value) {
		return new BILLING_ADDRESS(value);
	}

}
