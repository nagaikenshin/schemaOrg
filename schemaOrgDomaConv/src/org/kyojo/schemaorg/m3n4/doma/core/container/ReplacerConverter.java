package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REPLACER;
import org.kyojo.schemaorg.m3n4.core.Container.Replacer;

@ExternalDomain
public class ReplacerConverter implements DomainConverter<Replacer, String> {

	@Override
	public String fromDomainToValue(Replacer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Replacer fromValueToDomain(String value) {
		return new REPLACER(value);
	}

}
