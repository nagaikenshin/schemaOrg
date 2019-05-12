package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PLAYER_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.PlayerType;

@ExternalDomain
public class PlayerTypeConverter implements DomainConverter<PlayerType, String> {

	@Override
	public String fromDomainToValue(PlayerType domain) {
		return domain.getNativeValue();
	}

	@Override
	public PlayerType fromValueToDomain(String value) {
		return new PLAYER_TYPE(value);
	}

}
