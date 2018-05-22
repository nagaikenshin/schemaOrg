package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.STAR_RATING;
import org.kyojo.schemaOrg.m3n3.core.Container.StarRating;

@ExternalDomain
public class StarRatingConverter implements DomainConverter<StarRating, String> {

	@Override
	public String fromDomainToValue(StarRating domain) {
		return domain.getNativeValue();
	}

	@Override
	public StarRating fromValueToDomain(String value) {
		return new STAR_RATING(value);
	}

}
