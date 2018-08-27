package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WINNER;
import org.kyojo.schemaorg.m3n4.core.Container.Winner;

@ExternalDomain
public class WinnerConverter implements DomainConverter<Winner, String> {

	@Override
	public String fromDomainToValue(Winner domain) {
		return domain.getNativeValue();
	}

	@Override
	public Winner fromValueToDomain(String value) {
		return new WINNER(value);
	}

}
