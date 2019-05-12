package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GAME;
import org.kyojo.schemaorg.m3n5.core.Container.Game;

@ExternalDomain
public class GameConverter implements DomainConverter<Game, String> {

	@Override
	public String fromDomainToValue(Game domain) {
		return domain.getNativeValue();
	}

	@Override
	public Game fromValueToDomain(String value) {
		return new GAME(value);
	}

}
