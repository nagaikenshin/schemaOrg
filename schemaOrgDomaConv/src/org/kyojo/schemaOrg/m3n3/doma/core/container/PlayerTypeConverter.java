package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PLAYER_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.PlayerType;

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
