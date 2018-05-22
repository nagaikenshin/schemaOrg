package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOSTING_ORGANIZATION;
import org.kyojo.schemaOrg.m3n3.core.Container.HostingOrganization;

@ExternalDomain
public class HostingOrganizationConverter implements DomainConverter<HostingOrganization, String> {

	@Override
	public String fromDomainToValue(HostingOrganization domain) {
		return domain.getNativeValue();
	}

	@Override
	public HostingOrganization fromValueToDomain(String value) {
		return new HOSTING_ORGANIZATION(value);
	}

}
