package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CORRECTION_COMMENT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CorrectionComment;

@ExternalDomain
public class CorrectionCommentConverter implements DomainConverter<CorrectionComment, String> {

	@Override
	public String fromDomainToValue(CorrectionComment domain) {
		return domain.getNativeValue();
	}

	@Override
	public CorrectionComment fromValueToDomain(String value) {
		return new CORRECTION_COMMENT(value);
	}

}
