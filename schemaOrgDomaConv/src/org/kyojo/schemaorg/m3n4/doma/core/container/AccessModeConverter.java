package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ACCESS_MODE;
import org.kyojo.schemaorg.m3n4.core.Container.AccessMode;

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
