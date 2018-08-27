package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.ENDORSEMENT_RATING;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EndorsementRating;

@ExternalDomain
public class EndorsementRatingConverter implements DomainConverter<EndorsementRating, String> {

	@Override
	public String fromDomainToValue(EndorsementRating domain) {
		return domain.getNativeValue();
	}

	@Override
	public EndorsementRating fromValueToDomain(String value) {
		return new ENDORSEMENT_RATING(value);
	}

}
