package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCESS_MODE_SUFFICIENT;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessModeSufficient;

@ExternalDomain
public class AccessModeSufficientConverter implements DomainConverter<AccessModeSufficient, String> {

	@Override
	public String fromDomainToValue(AccessModeSufficient domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccessModeSufficient fromValueToDomain(String value) {
		return new ACCESS_MODE_SUFFICIENT(value);
	}

}
