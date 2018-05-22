package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HIRING_ORGANIZATION;
import org.kyojo.schemaOrg.m3n3.core.Container.HiringOrganization;

@ExternalDomain
public class HiringOrganizationConverter implements DomainConverter<HiringOrganization, String> {

	@Override
	public String fromDomainToValue(HiringOrganization domain) {
		return domain.getNativeValue();
	}

	@Override
	public HiringOrganization fromValueToDomain(String value) {
		return new HIRING_ORGANIZATION(value);
	}

}
