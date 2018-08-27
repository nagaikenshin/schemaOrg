package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WORST_RATING;
import org.kyojo.schemaorg.m3n4.core.Container.WorstRating;

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
