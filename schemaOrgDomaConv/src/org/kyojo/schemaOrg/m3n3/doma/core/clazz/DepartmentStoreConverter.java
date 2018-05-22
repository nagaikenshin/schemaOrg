package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPARTMENT_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DepartmentStore;

@ExternalDomain
public class DepartmentStoreConverter implements DomainConverter<DepartmentStore, String> {

	@Override
	public String fromDomainToValue(DepartmentStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public DepartmentStore fromValueToDomain(String value) {
		return new DEPARTMENT_STORE(value);
	}

}
