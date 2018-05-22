package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REVIEW_BODY;
import org.kyojo.schemaOrg.m3n3.core.Container.ReviewBody;

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
