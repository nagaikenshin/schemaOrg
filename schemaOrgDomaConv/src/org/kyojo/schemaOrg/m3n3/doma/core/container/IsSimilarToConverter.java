package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IS_SIMILAR_TO;
import org.kyojo.schemaOrg.m3n3.core.Container.IsSimilarTo;

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
