package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SOURCE_ORGANIZATION;
import org.kyojo.schemaOrg.m3n3.core.Container.SourceOrganization;

@ExternalDomain
public class SourceOrganizationConverter implements DomainConverter<SourceOrganization, String> {

	@Override
	public String fromDomainToValue(SourceOrganization domain) {
		return domain.getNativeValue();
	}

	@Override
	public SourceOrganization fromValueToDomain(String value) {
		return new SOURCE_ORGANIZATION(value);
	}

}
