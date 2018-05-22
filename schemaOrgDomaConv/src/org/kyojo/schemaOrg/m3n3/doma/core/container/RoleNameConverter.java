package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ROLE_NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.RoleName;

@ExternalDomain
public class RoleNameConverter implements DomainConverter<RoleName, String> {

	@Override
	public String fromDomainToValue(RoleName domain) {
		return domain.getNativeValue();
	}

	@Override
	public RoleName fromValueToDomain(String value) {
		return new ROLE_NAME(value);
	}

}
