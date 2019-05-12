package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COMMENT_TIME;
import org.kyojo.schemaorg.m3n5.core.Container.CommentTime;

@ExternalDomain
public class CommentTimeConverter implements DomainConverter<CommentTime, Date> {

	@Override
	public Date fromDomainToValue(CommentTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public CommentTime fromValueToDomain(Date value) {
		return new COMMENT_TIME(value);
	}

}
