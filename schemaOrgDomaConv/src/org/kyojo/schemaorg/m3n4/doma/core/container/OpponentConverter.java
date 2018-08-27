package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.OPPONENT;
import org.kyojo.schemaorg.m3n4.core.Container.Opponent;

@ExternalDomain
public class OpponentConverter implements DomainConverter<Opponent, String> {

	@Override
	public String fromDomainToValue(Opponent domain) {
		return domain.getNativeValue();
	}

	@Override
	public Opponent fromValueToDomain(String value) {
		return new OPPONENT(value);
	}

}
