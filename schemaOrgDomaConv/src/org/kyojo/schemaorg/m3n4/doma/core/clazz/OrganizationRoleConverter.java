package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ORGANIZATION_ROLE;
import org.kyojo.schemaorg.m3n4.core.Clazz.OrganizationRole;

@ExternalDomain
public class OrganizationRoleConverter implements DomainConverter<OrganizationRole, String> {

	@Override
	public String fromDomainToValue(OrganizationRole domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrganizationRole fromValueToDomain(String value) {
		return new ORGANIZATION_ROLE(value);
	}

}
