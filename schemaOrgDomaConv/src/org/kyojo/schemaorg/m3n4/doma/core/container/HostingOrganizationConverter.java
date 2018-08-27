package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HOSTING_ORGANIZATION;
import org.kyojo.schemaorg.m3n4.core.Container.HostingOrganization;

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
