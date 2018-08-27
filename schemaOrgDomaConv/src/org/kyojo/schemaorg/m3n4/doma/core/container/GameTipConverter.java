package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GAME_TIP;
import org.kyojo.schemaorg.m3n4.core.Container.GameTip;

@ExternalDomain
public class GameTipConverter implements DomainConverter<GameTip, String> {

	@Override
	public String fromDomainToValue(GameTip domain) {
		return domain.getNativeValue();
	}

	@Override
	public GameTip fromValueToDomain(String value) {
		return new GAME_TIP(value);
	}

}