package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GAME_LOCATION;
import org.kyojo.schemaorg.m3n4.core.Container.GameLocation;

@ExternalDomain
public class GameLocationConverter implements DomainConverter<GameLocation, String> {

	@Override
	public String fromDomainToValue(GameLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public GameLocation fromValueToDomain(String value) {
		return new GAME_LOCATION(value);
	}

}