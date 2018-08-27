package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LOSER;
import org.kyojo.schemaorg.m3n4.core.Container.Loser;

@ExternalDomain
public class LoserConverter implements DomainConverter<Loser, String> {

	@Override
	public String fromDomainToValue(Loser domain) {
		return domain.getNativeValue();
	}

	@Override
	public Loser fromValueToDomain(String value) {
		return new LOSER(value);
	}

}