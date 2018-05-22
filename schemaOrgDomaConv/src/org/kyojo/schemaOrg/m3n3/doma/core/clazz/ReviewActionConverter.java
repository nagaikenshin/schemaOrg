package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REVIEW_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ReviewAction;

@ExternalDomain
public class ReviewActionConverter implements DomainConverter<ReviewAction, String> {

	@Override
	public String fromDomainToValue(ReviewAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReviewAction fromValueToDomain(String value) {
		return new REVIEW_ACTION(value);
	}

}
