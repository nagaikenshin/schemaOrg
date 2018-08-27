package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.REVIEW_ASPECT;
import org.kyojo.schemaorg.m3n4.pending.Container.ReviewAspect;

@ExternalDomain
public class ReviewAspectConverter implements DomainConverter<ReviewAspect, String> {

	@Override
	public String fromDomainToValue(ReviewAspect domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReviewAspect fromValueToDomain(String value) {
		return new REVIEW_ASPECT(value);
	}

}
