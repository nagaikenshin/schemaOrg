package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCESS_CODE;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessCode;

@ExternalDomain
public class AccessCodeConverter implements DomainConverter<AccessCode, String> {

	@Override
	public String fromDomainToValue(AccessCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccessCode fromValueToDomain(String value) {
		return new ACCESS_CODE(value);
	}

}
