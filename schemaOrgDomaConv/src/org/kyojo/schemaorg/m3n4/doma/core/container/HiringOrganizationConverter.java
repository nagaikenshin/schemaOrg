package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HIRING_ORGANIZATION;
import org.kyojo.schemaorg.m3n4.core.Container.HiringOrganization;

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
