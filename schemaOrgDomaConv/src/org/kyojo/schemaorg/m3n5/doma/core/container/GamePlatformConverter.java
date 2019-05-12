package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GAME_PLATFORM;
import org.kyojo.schemaorg.m3n5.core.Container.GamePlatform;

@ExternalDomain
public class GamePlatformConverter implements DomainConverter<GamePlatform, String> {

	@Override
	public String fromDomainToValue(GamePlatform domain) {
		return domain.getNativeValue();
	}

	@Override
	public GamePlatform fromValueToDomain(String value) {
		return new GAME_PLATFORM(value);
	}

}
