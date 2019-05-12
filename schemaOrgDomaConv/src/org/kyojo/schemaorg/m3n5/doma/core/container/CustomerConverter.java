package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CUSTOMER;
import org.kyojo.schemaorg.m3n5.core.Container.Customer;

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
