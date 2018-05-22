package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCESS_MODE;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessMode;

@ExternalDomain
public class AccessModeConverter implements DomainConverter<AccessMode, String> {

	@Override
	public String fromDomainToValue(AccessMode domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccessMode fromValueToDomain(String value) {
		return new ACCESS_MODE(value);
	}

}
