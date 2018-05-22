package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COMMENT_TEXT;
import org.kyojo.schemaOrg.m3n3.core.Container.CommentText;

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
