package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPORTS_ORGANIZATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SportsOrganization;

@ExternalDomain
public class SportsOrganizationConverter implements DomainConverter<SportsOrganization, String> {

	@Override
	public String fromDomainToValue(SportsOrganization domain) {
		return domain.getNativeValue();
	}

	@Override
	public SportsOrganization fromValueToDomain(String value) {
		return new SPORTS_ORGANIZATION(value);
	}

}
