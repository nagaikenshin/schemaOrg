package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ROLE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Role;

@ExternalDomain
public class RoleConverter implements DomainConverter<Role, String> {

	@Override
	public String fromDomainToValue(Role domain) {
		return domain.getNativeValue();
	}

	@Override
	public Role fromValueToDomain(String value) {
		return new ROLE(value);
	}

}
