package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GAME_PLATFORM;
import org.kyojo.schemaOrg.m3n3.core.Container.GamePlatform;

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
