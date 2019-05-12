package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CLAIM_REVIEWED;
import org.kyojo.schemaorg.m3n5.core.Container.ClaimReviewed;

@ExternalDomain
public class ClaimReviewedConverter implements DomainConverter<ClaimReviewed, String> {

	@Override
	public String fromDomainToValue(ClaimReviewed domain) {
		return domain.getNativeValue();
	}

	@Override
	public ClaimReviewed fromValueToDomain(String value) {
		return new CLAIM_REVIEWED(value);
	}

}
