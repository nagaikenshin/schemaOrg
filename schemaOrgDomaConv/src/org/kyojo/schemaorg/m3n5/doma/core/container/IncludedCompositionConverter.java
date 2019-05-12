package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INCLUDED_COMPOSITION;
import org.kyojo.schemaorg.m3n5.core.Container.IncludedComposition;

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
