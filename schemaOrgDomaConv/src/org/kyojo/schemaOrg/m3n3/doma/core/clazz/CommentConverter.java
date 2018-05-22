package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COMMENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Comment;

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
