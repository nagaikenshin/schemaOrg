package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CLAIM_REVIEW;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ClaimReview;

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
