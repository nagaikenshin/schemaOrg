package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_PLAYERS;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfPlayers;

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
