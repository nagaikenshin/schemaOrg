package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ACCESS_MODE_SUFFICIENT;
import org.kyojo.schemaorg.m3n5.core.Container.AccessModeSufficient;

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
