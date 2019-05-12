package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NUMBER_OF_EMPLOYEES;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfEmployees;

@ExternalDomain
public class NumberOfEmployeesConverter implements DomainConverter<NumberOfEmployees, String> {

	@Override
	public String fromDomainToValue(NumberOfEmployees domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfEmployees fromValueToDomain(String value) {
		return new NUMBER_OF_EMPLOYEES(value);
	}

}
