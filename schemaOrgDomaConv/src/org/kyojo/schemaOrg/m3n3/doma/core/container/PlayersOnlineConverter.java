package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PLAYERS_ONLINE;
import org.kyojo.schemaOrg.m3n3.core.Container.PlayersOnline;

@ExternalDomain
public class PlayersOnlineConverter implements DomainConverter<PlayersOnline, Long> {

	@Override
	public Long fromDomainToValue(PlayersOnline domain) {
		return domain.getNativeValue();
	}

	@Override
	public PlayersOnline fromValueToDomain(Long value) {
		return new PLAYERS_ONLINE(value);
	}

}
