package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOME_TEAM;
import org.kyojo.schemaOrg.m3n3.core.Container.HomeTeam;

@ExternalDomain
public class HomeTeamConverter implements DomainConverter<HomeTeam, String> {

	@Override
	public String fromDomainToValue(HomeTeam domain) {
		return domain.getNativeValue();
	}

	@Override
	public HomeTeam fromValueToDomain(String value) {
		return new HOME_TEAM(value);
	}

}
