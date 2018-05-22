package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESULT_COMMENT;
import org.kyojo.schemaOrg.m3n3.core.Container.ResultComment;

@ExternalDomain
public class ResultCommentConverter implements DomainConverter<ResultComment, String> {

	@Override
	public String fromDomainToValue(ResultComment domain) {
		return domain.getNativeValue();
	}

	@Override
	public ResultComment fromValueToDomain(String value) {
		return new RESULT_COMMENT(value);
	}

}
