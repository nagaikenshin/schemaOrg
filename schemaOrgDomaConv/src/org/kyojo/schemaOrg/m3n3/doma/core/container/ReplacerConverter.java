package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REPLACER;
import org.kyojo.schemaOrg.m3n3.core.Container.Replacer;

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
