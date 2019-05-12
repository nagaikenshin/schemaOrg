package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.REVIEW_COUNT;
import org.kyojo.schemaorg.m3n5.core.Container.ReviewCount;

@ExternalDomain
public class ReviewCountConverter implements DomainConverter<ReviewCount, Long> {

	@Override
	public Long fromDomainToValue(ReviewCount domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReviewCount fromValueToDomain(Long value) {
		return new REVIEW_COUNT(value);
	}

}
