package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PARENT_ORGANIZATION;
import org.kyojo.schemaorg.m3n4.core.Container.ParentOrganization;

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
