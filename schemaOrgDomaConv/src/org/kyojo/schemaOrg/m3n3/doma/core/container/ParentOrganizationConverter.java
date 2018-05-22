package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PARENT_ORGANIZATION;
import org.kyojo.schemaOrg.m3n3.core.Container.ParentOrganization;

@ExternalDomain
public class ParentOrganizationConverter implements DomainConverter<ParentOrganization, String> {

	@Override
	public String fromDomainToValue(ParentOrganization domain) {
		return domain.getNativeValue();
	}

	@Override
	public ParentOrganization fromValueToDomain(String value) {
		return new PARENT_ORGANIZATION(value);
	}

}
