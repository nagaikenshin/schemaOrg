package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ERROR;
import org.kyojo.schemaOrg.m3n3.core.Container.Error;

@ExternalDomain
public class ErrorConverter implements DomainConverter<Error, String> {

	@Override
	public String fromDomainToValue(Error domain) {
		return domain.getNativeValue();
	}

	@Override
	public Error fromValueToDomain(String value) {
		return new ERROR(value);
	}

}
