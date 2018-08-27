package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.IS_SIMILAR_TO;
import org.kyojo.schemaorg.m3n4.core.Container.IsSimilarTo;

@ExternalDomain
public class IsSimilarToConverter implements DomainConverter<IsSimilarTo, String> {

	@Override
	public String fromDomainToValue(IsSimilarTo domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsSimilarTo fromValueToDomain(String value) {
		return new IS_SIMILAR_TO(value);
	}

}
