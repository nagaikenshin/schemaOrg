package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GAME_PLAY_MODE;
import org.kyojo.schemaorg.m3n4.core.Clazz.GamePlayMode;

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
