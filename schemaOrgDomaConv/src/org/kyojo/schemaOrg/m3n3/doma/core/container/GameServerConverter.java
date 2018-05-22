package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GAME_SERVER;
import org.kyojo.schemaOrg.m3n3.core.Container.GameServer;

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
