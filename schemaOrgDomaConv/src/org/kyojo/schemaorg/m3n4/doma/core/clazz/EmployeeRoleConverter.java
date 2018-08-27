package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EMPLOYEE_ROLE;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmployeeRole;

@ExternalDomain
public class EmployeeRoleConverter implements DomainConverter<EmployeeRole, String> {

	@Override
	public String fromDomainToValue(EmployeeRole domain) {
		return domain.getNativeValue();
	}

	@Override
	public EmployeeRole fromValueToDomain(String value) {
		return new EMPLOYEE_ROLE(value);
	}

}
