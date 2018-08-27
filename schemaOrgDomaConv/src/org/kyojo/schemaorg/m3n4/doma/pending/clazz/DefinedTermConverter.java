package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.DEFINED_TERM;
import org.kyojo.schemaorg.m3n4.pending.Clazz.DefinedTerm;

@ExternalDomain
public class DefinedTermConverter implements DomainConverter<DefinedTerm, String> {

	@Override
	public String fromDomainToValue(DefinedTerm domain) {
		return domain.getNativeValue();
	}

	@Override
	public DefinedTerm fromValueToDomain(String value) {
		return new DEFINED_TERM(value);
	}

}
