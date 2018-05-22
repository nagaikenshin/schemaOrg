package org.kyojo.schemaOrg.m3n3.doma.core.gamePlayMode;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.gamePlayMode.CO_OP;
import org.kyojo.schemaOrg.m3n3.core.GamePlayMode.CoOp;

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
