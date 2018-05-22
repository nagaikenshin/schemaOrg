package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COMMENT_COUNT;
import org.kyojo.schemaOrg.m3n3.core.Container.CommentCount;

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
