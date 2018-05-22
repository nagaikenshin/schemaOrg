package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPARTMENT;
import org.kyojo.schemaOrg.m3n3.core.Container.Department;

@ExternalDomain
public class DepartmentConverter implements DomainConverter<Department, String> {

	@Override
	public String fromDomainToValue(Department domain) {
		return domain.getNativeValue();
	}

	@Override
	public Department fromValueToDomain(String value) {
		return new DEPARTMENT(value);
	}

}
