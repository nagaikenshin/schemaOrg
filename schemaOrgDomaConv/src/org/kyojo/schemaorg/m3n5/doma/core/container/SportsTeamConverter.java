package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SPORTS_TEAM;
import org.kyojo.schemaorg.m3n5.core.Container.SportsTeam;

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
