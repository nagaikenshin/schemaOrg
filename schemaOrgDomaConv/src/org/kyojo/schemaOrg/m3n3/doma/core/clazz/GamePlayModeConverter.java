package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GAME_PLAY_MODE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GamePlayMode;

@ExternalDomain
public class GamePlayModeConverter implements DomainConverter<GamePlayMode, String> {

	@Override
	public String fromDomainToValue(GamePlayMode domain) {
		return domain.getNativeValue();
	}

	@Override
	public GamePlayMode fromValueToDomain(String value) {
		return new GAME_PLAY_MODE(value);
	}

}
