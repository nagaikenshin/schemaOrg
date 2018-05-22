package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESULT_REVIEW;
import org.kyojo.schemaOrg.m3n3.core.Container.ResultReview;

@ExternalDomain
public class ResultReviewConverter implements DomainConverter<ResultReview, String> {

	@Override
	public String fromDomainToValue(ResultReview domain) {
		return domain.getNativeValue();
	}

	@Override
	public ResultReview fromValueToDomain(String value) {
		return new RESULT_REVIEW(value);
	}

}
