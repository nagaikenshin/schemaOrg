package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REVIEW;
import org.kyojo.schemaOrg.m3n3.core.Container.Review;

@ExternalDomain
public class ReviewConverter implements DomainConverter<Review, String> {

	@Override
	public String fromDomainToValue(Review domain) {
		return domain.getNativeValue();
	}

	@Override
	public Review fromValueToDomain(String value) {
		return new REVIEW(value);
	}

}
