package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SOURCE_ORGANIZATION;
import org.kyojo.schemaorg.m3n4.core.Container.SourceOrganization;

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
