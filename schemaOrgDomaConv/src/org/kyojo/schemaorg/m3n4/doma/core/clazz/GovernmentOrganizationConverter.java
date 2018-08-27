package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GOVERNMENT_ORGANIZATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentOrganization;

@ExternalDomain
public class GovernmentOrganizationConverter implements DomainConverter<GovernmentOrganization, String> {

	@Override
	public String fromDomainToValue(GovernmentOrganization domain) {
		return domain.getNativeValue();
	}

	@Override
	public GovernmentOrganization fromValueToDomain(String value) {
		return new GOVERNMENT_ORGANIZATION(value);
	}

}
