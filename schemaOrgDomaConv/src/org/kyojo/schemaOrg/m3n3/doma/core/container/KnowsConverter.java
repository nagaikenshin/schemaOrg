package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.KNOWS;
import org.kyojo.schemaOrg.m3n3.core.Container.Knows;

@ExternalDomain
public class KnowsConverter implements DomainConverter<Knows, String> {

	@Override
	public String fromDomainToValue(Knows domain) {
		return domain.getNativeValue();
	}

	@Override
	public Knows fromValueToDomain(String value) {
		return new KNOWS(value);
	}

}
