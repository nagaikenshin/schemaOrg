package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ROLE;
import org.kyojo.schemaorg.m3n4.core.Clazz.Role;

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
