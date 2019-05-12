package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SUB_ORGANIZATION;
import org.kyojo.schemaorg.m3n5.core.Container.SubOrganization;

@ExternalDomain
public class SubOrganizationConverter implements DomainConverter<SubOrganization, String> {

	@Override
	public String fromDomainToValue(SubOrganization domain) {
		return domain.getNativeValue();
	}

	@Override
	public SubOrganization fromValueToDomain(String value) {
		return new SUB_ORGANIZATION(value);
	}

}
