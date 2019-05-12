package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COMMENT_COUNT;
import org.kyojo.schemaorg.m3n5.core.Container.CommentCount;

@ExternalDomain
public class CommentCountConverter implements DomainConverter<CommentCount, Long> {

	@Override
	public Long fromDomainToValue(CommentCount domain) {
		return domain.getNativeValue();
	}

	@Override
	public CommentCount fromValueToDomain(Long value) {
		return new COMMENT_COUNT(value);
	}

}
