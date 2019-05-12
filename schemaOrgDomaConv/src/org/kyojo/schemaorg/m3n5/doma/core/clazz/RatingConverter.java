package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RATING;
import org.kyojo.schemaorg.m3n5.core.Clazz.Rating;

@ExternalDomain
public class RatingConverter implements DomainConverter<Rating, String> {

	@Override
	public String fromDomainToValue(Rating domain) {
		return domain.getNativeValue();
	}

	@Override
	public Rating fromValueToDomain(String value) {
		return new RATING(value);
	}

}
