package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.DEFINED_TERM_SET;
import org.kyojo.schemaorg.m3n4.pending.Clazz.DefinedTermSet;

@ExternalDomain
public class DefinedTermSetConverter implements DomainConverter<DefinedTermSet, String> {

	@Override
	public String fromDomainToValue(DefinedTermSet domain) {
		return domain.getNativeValue();
	}

	@Override
	public DefinedTermSet fromValueToDomain(String value) {
		return new DEFINED_TERM_SET(value);
	}

}
