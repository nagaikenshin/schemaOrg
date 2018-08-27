package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CLAIM_REVIEW;
import org.kyojo.schemaorg.m3n4.core.Clazz.ClaimReview;

@ExternalDomain
public class ClaimReviewConverter implements DomainConverter<ClaimReview, String> {

	@Override
	public String fromDomainToValue(ClaimReview domain) {
		return domain.getNativeValue();
	}

	@Override
	public ClaimReview fromValueToDomain(String value) {
		return new CLAIM_REVIEW(value);
	}

}
