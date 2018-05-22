package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPORTS_TEAM;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SportsTeam;

@ExternalDomain
public class SportsTeamConverter implements DomainConverter<SportsTeam, String> {

	@Override
	public String fromDomainToValue(SportsTeam domain) {
		return domain.getNativeValue();
	}

	@Override
	public SportsTeam fromValueToDomain(String value) {
		return new SPORTS_TEAM(value);
	}

}
