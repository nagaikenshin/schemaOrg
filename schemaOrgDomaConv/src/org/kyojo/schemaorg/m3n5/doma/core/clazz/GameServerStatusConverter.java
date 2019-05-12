package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GAME_SERVER_STATUS;
import org.kyojo.schemaorg.m3n5.core.Clazz.GameServerStatus;

@ExternalDomain
public class GameServerStatusConverter implements DomainConverter<GameServerStatus, String> {

	@Override
	public String fromDomainToValue(GameServerStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public GameServerStatus fromValueToDomain(String value) {
		return new GAME_SERVER_STATUS(value);
	}

}
