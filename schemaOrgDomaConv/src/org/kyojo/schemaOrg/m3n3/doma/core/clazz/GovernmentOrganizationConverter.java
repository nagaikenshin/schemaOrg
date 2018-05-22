package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GOVERNMENT_ORGANIZATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GovernmentOrganization;

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
