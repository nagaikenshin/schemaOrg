package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AWAY_TEAM;
import org.kyojo.schemaOrg.m3n3.core.Container.AwayTeam;

@ExternalDomain
public class AwayTeamConverter implements DomainConverter<AwayTeam, String> {

	@Override
	public String fromDomainToValue(AwayTeam domain) {
		return domain.getNativeValue();
	}

	@Override
	public AwayTeam fromValueToDomain(String value) {
		return new AWAY_TEAM(value);
	}

}
