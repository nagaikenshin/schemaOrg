package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.REVIEW_RATING;
import org.kyojo.schemaorg.m3n5.core.Container.ReviewRating;

@ExternalDomain
public class ReviewRatingConverter implements DomainConverter<ReviewRating, String> {

	@Override
	public String fromDomainToValue(ReviewRating domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReviewRating fromValueToDomain(String value) {
		return new REVIEW_RATING(value);
	}

}
