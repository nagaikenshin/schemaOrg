package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESULT;
import org.kyojo.schemaOrg.m3n3.core.Container.Result;

@ExternalDomain
public class ResultConverter implements DomainConverter<Result, String> {

	@Override
	public String fromDomainToValue(Result domain) {
		return domain.getNativeValue();
	}

	@Override
	public Result fromValueToDomain(String value) {
		return new RESULT(value);
	}

}
