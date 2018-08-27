package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.KNOWS;
import org.kyojo.schemaorg.m3n4.core.Container.Knows;

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
