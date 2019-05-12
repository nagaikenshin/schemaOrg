package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.IN_DEFINED_TERM_SET;
import org.kyojo.schemaorg.m3n5.pending.Container.InDefinedTermSet;

@ExternalDomain
public class InDefinedTermSetConverter implements DomainConverter<InDefinedTermSet, String> {

	@Override
	public String fromDomainToValue(InDefinedTermSet domain) {
		return domain.getNativeValue();
	}

	@Override
	public InDefinedTermSet fromValueToDomain(String value) {
		return new IN_DEFINED_TERM_SET(value);
	}

}
