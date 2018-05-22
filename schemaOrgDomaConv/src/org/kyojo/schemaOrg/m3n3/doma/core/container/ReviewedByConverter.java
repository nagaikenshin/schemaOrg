package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REVIEWED_BY;
import org.kyojo.schemaOrg.m3n3.core.Container.ReviewedBy;

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
