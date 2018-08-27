package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COMMENT_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.CommentAction;

@ExternalDomain
public class CommentActionConverter implements DomainConverter<CommentAction, String> {

	@Override
	public String fromDomainToValue(CommentAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public CommentAction fromValueToDomain(String value) {
		return new COMMENT_ACTION(value);
	}

}
