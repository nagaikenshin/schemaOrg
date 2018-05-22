package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.UPVOTE_COUNT;
import org.kyojo.schemaOrg.m3n3.core.Container.UpvoteCount;

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
