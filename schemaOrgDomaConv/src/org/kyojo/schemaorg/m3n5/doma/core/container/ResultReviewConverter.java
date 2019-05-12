package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RESULT_REVIEW;
import org.kyojo.schemaorg.m3n5.core.Container.ResultReview;

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
