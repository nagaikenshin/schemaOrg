package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LOSER;
import org.kyojo.schemaOrg.m3n3.core.Container.Loser;

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
