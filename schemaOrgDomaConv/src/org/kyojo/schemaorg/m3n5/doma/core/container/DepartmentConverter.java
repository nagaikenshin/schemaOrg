package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DEPARTMENT;
import org.kyojo.schemaorg.m3n5.core.Container.Department;

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
