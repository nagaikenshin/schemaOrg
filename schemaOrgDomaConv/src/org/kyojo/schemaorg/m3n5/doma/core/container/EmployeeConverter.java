package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.EMPLOYEE;
import org.kyojo.schemaorg.m3n5.core.Container.Employee;

@ExternalDomain
public class EmployeeConverter implements DomainConverter<Employee, String> {

	@Override
	public String fromDomainToValue(Employee domain) {
		return domain.getNativeValue();
	}

	@Override
	public Employee fromValueToDomain(String value) {
		return new EMPLOYEE(value);
	}

}