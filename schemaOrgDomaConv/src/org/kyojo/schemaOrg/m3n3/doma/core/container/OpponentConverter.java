package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OPPONENT;
import org.kyojo.schemaOrg.m3n3.core.Container.Opponent;

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
