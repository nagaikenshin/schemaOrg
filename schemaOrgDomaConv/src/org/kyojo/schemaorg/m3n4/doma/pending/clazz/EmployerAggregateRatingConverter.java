package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.EMPLOYER_AGGREGATE_RATING;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EmployerAggregateRating;

@ExternalDomain
public class EmployerAggregateRatingConverter implements DomainConverter<EmployerAggregateRating, String> {

	@Override
	public String fromDomainToValue(EmployerAggregateRating domain) {
		return domain.getNativeValue();
	}

	@Override
	public EmployerAggregateRating fromValueToDomain(String value) {
		return new EMPLOYER_AGGREGATE_RATING(value);
	}

}
