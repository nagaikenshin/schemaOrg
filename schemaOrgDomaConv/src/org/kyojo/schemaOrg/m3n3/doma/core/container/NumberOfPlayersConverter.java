package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NUMBER_OF_PLAYERS;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfPlayers;

@ExternalDomain
public class NumberOfPlayersConverter implements DomainConverter<NumberOfPlayers, String> {

	@Override
	public String fromDomainToValue(NumberOfPlayers domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfPlayers fromValueToDomain(String value) {
		return new NUMBER_OF_PLAYERS(value);
	}

}
