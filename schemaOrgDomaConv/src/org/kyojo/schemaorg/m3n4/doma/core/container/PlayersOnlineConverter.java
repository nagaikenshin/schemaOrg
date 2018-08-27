package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PLAYERS_ONLINE;
import org.kyojo.schemaorg.m3n4.core.Container.PlayersOnline;

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