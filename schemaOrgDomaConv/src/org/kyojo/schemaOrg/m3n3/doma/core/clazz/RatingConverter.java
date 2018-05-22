package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RATING;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Rating;

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
