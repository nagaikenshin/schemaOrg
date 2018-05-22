package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EMPLOYEE_ROLE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EmployeeRole;

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
