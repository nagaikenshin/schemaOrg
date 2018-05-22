package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DOWNVOTE_COUNT;
import org.kyojo.schemaOrg.m3n3.core.Container.DownvoteCount;

@ExternalDomain
public class DownvoteCountConverter implements DomainConverter<DownvoteCount, Long> {

	@Override
	public Long fromDomainToValue(DownvoteCount domain) {
		return domain.getNativeValue();
	}

	@Override
	public DownvoteCount fromValueToDomain(Long value) {
		return new DOWNVOTE_COUNT(value);
	}

}
