package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REVIEW;
import org.kyojo.schemaorg.m3n4.core.Clazz.Review;

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
