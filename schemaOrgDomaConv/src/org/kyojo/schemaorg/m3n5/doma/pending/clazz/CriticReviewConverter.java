package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CRITIC_REVIEW;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CriticReview;

@ExternalDomain
public class CriticReviewConverter implements DomainConverter<CriticReview, String> {

	@Override
	public String fromDomainToValue(CriticReview domain) {
		return domain.getNativeValue();
	}

	@Override
	public CriticReview fromValueToDomain(String value) {
		return new CRITIC_REVIEW(value);
	}

}
