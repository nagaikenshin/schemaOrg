package org.kyojo.schemaorg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.core.impl.RATING_COUNT;
import org.kyojo.schemaorg.m3n3.core.Container.RatingCount;

@ExternalDomain
public class RatingCountConverter implements DomainConverter<RatingCount, Long> {

	@Override
	public Long fromDomainToValue(RatingCount domain) {
		return domain.getNativeValue();
	}

	@Override
	public RatingCount fromValueToDomain(Long value) {
		return new RATING_COUNT(value);
	}

}
