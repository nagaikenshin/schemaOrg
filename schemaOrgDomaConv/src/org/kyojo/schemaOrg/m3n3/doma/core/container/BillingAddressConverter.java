package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BILLING_ADDRESS;
import org.kyojo.schemaOrg.m3n3.core.Container.BillingAddress;

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
