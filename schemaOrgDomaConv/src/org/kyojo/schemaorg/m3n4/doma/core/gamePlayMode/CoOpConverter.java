package org.kyojo.schemaorg.m3n4.doma.core.gamePlayMode;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.gamePlayMode.CO_OP;
import org.kyojo.schemaorg.m3n4.core.GamePlayMode.CoOp;

@ExternalDomain
public class CoOpConverter implements DomainConverter<CoOp, String> {

	@Override
	public String fromDomainToValue(CoOp domain) {
		return domain.getNativeValue();
	}

	@Override
	public CoOp fromValueToDomain(String value) {
		return new CO_OP(value);
	}

}
