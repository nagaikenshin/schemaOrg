package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SPORTS_ORGANIZATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.SportsOrganization;

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
