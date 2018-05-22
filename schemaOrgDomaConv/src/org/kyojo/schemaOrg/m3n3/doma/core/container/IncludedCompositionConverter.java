package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INCLUDED_COMPOSITION;
import org.kyojo.schemaOrg.m3n3.core.Container.IncludedComposition;

@ExternalDomain
public class IncludedCompositionConverter implements DomainConverter<IncludedComposition, String> {

	@Override
	public String fromDomainToValue(IncludedComposition domain) {
		return domain.getNativeValue();
	}

	@Override
	public IncludedComposition fromValueToDomain(String value) {
		return new INCLUDED_COMPOSITION(value);
	}

}
