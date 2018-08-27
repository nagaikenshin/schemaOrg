package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GAME_SERVER;
import org.kyojo.schemaorg.m3n4.core.Container.GameServer;

@ExternalDomain
public class GameServerConverter implements DomainConverter<GameServer, String> {

	@Override
	public String fromDomainToValue(GameServer domain) {
		return domain.getNativeValue();
	}

	@Override
	public GameServer fromValueToDomain(String value) {
		return new GAME_SERVER(value);
	}

}
