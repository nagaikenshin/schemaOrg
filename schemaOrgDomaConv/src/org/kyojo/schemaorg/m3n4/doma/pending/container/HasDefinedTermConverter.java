package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.HAS_DEFINED_TERM;
import org.kyojo.schemaorg.m3n4.pending.Container.HasDefinedTerm;

@ExternalDomain
public class HasDefinedTermConverter implements DomainConverter<HasDefinedTerm, String> {

	@Override
	public String fromDomainToValue(HasDefinedTerm domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasDefinedTerm fromValueToDomain(String value) {
		return new HAS_DEFINED_TERM(value);
	}

}
