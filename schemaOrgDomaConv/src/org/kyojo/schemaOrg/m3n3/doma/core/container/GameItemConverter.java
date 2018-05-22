package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GAME_ITEM;
import org.kyojo.schemaOrg.m3n3.core.Container.GameItem;

@ExternalDomain
public class GameItemConverter implements DomainConverter<GameItem, String> {

	@Override
	public String fromDomainToValue(GameItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public GameItem fromValueToDomain(String value) {
		return new GAME_ITEM(value);
	}

}
