package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BEST_RATING;
import org.kyojo.schemaOrg.m3n3.core.Container.BestRating;

@ExternalDomain
public class BestRatingConverter implements DomainConverter<BestRating, String> {

	@Override
	public String fromDomainToValue(BestRating domain) {
		return domain.getNativeValue();
	}

	@Override
	public BestRating fromValueToDomain(String value) {
		return new BEST_RATING(value);
	}

}
