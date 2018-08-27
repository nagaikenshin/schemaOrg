package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.EMPLOYER_REVIEW;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EmployerReview;

@ExternalDomain
public class EmployerReviewConverter implements DomainConverter<EmployerReview, String> {

	@Override
	public String fromDomainToValue(EmployerReview domain) {
		return domain.getNativeValue();
	}

	@Override
	public EmployerReview fromValueToDomain(String value) {
		return new EMPLOYER_REVIEW(value);
	}

}
