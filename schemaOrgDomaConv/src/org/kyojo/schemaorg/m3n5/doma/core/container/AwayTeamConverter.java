package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AWAY_TEAM;
import org.kyojo.schemaorg.m3n5.core.Container.AwayTeam;

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
