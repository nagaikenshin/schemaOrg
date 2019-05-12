package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.REVIEW_BODY;
import org.kyojo.schemaorg.m3n5.core.Container.ReviewBody;

@ExternalDomain
public class ReviewBodyConverter implements DomainConverter<ReviewBody, String> {

	@Override
	public String fromDomainToValue(ReviewBody domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReviewBody fromValueToDomain(String value) {
		return new REVIEW_BODY(value);
	}

}
