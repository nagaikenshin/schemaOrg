package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.USER_REVIEW;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.UserReview;

@ExternalDomain
public class UserReviewConverter implements DomainConverter<UserReview, String> {

	@Override
	public String fromDomainToValue(UserReview domain) {
		return domain.getNativeValue();
	}

	@Override
	public UserReview fromValueToDomain(String value) {
		return new USER_REVIEW(value);
	}

}
