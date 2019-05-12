package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.REVIEWED_BY;
import org.kyojo.schemaorg.m3n5.core.Container.ReviewedBy;

@ExternalDomain
public class ReviewedByConverter implements DomainConverter<ReviewedBy, String> {

	@Override
	public String fromDomainToValue(ReviewedBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReviewedBy fromValueToDomain(String value) {
		return new REVIEWED_BY(value);
	}

}