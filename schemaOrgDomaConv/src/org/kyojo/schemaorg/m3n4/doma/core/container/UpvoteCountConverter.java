package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.UPVOTE_COUNT;
import org.kyojo.schemaorg.m3n4.core.Container.UpvoteCount;

@ExternalDomain
public class UpvoteCountConverter implements DomainConverter<UpvoteCount, Long> {

	@Override
	public Long fromDomainToValue(UpvoteCount domain) {
		return domain.getNativeValue();
	}

	@Override
	public UpvoteCount fromValueToDomain(Long value) {
		return new UPVOTE_COUNT(value);
	}

}
