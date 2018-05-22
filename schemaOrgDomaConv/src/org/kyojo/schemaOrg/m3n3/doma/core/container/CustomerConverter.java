package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CUSTOMER;
import org.kyojo.schemaOrg.m3n3.core.Container.Customer;

@ExternalDomain
public class CustomerConverter implements DomainConverter<Customer, String> {

	@Override
	public String fromDomainToValue(Customer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Customer fromValueToDomain(String value) {
		return new CUSTOMER(value);
	}

}
