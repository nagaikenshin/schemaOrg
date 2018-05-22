package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PERMISSION_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.PermissionType;

@ExternalDomain
public class PermissionTypeConverter implements DomainConverter<PermissionType, String> {

	@Override
	public String fromDomainToValue(PermissionType domain) {
		return domain.getNativeValue();
	}

	@Override
	public PermissionType fromValueToDomain(String value) {
		return new PERMISSION_TYPE(value);
	}

}
