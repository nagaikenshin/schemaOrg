package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DEPARTMENT_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.DepartmentStore;

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
