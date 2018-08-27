package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COMMENT_TEXT;
import org.kyojo.schemaorg.m3n4.core.Container.CommentText;

@ExternalDomain
public class CommentTextConverter implements DomainConverter<CommentText, String> {

	@Override
	public String fromDomainToValue(CommentText domain) {
		return domain.getNativeValue();
	}

	@Override
	public CommentText fromValueToDomain(String value) {
		return new COMMENT_TEXT(value);
	}

}
