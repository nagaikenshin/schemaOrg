package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COMMENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.Comment;

@ExternalDomain
public class CommentConverter implements DomainConverter<Comment, String> {

	@Override
	public String fromDomainToValue(Comment domain) {
		return domain.getNativeValue();
	}

	@Override
	public Comment fromValueToDomain(String value) {
		return new COMMENT(value);
	}

}
