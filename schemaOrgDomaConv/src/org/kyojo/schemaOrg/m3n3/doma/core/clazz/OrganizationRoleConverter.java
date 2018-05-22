package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORGANIZATION_ROLE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OrganizationRole;

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
