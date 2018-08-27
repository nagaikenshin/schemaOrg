package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PERMISSION_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.PermissionType;

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
