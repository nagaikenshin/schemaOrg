package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AGGREGATE_RATING;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AggregateRating;

@ExternalDomain
public class AggregateRatingConverter implements DomainConverter<AggregateRating, String> {

	@Override
	public String fromDomainToValue(AggregateRating domain) {
		return domain.getNativeValue();
	}

	@Override
	public AggregateRating fromValueToDomain(String value) {
		return new AGGREGATE_RATING(value);
	}

}
