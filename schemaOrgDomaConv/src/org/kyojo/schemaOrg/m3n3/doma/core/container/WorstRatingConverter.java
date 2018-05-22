package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WORST_RATING;
import org.kyojo.schemaOrg.m3n3.core.Container.WorstRating;

@ExternalDomain
public class WorstRatingConverter implements DomainConverter<WorstRating, String> {

	@Override
	public String fromDomainToValue(WorstRating domain) {
		return domain.getNativeValue();
	}

	@Override
	public WorstRating fromValueToDomain(String value) {
		return new WORST_RATING(value);
	}

}
