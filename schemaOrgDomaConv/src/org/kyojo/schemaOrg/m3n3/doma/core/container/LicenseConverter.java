package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LICENSE;
import org.kyojo.schemaOrg.m3n3.core.Container.License;

@ExternalDomain
public class LicenseConverter implements DomainConverter<License, String> {

	@Override
	public String fromDomainToValue(License domain) {
		return domain.getNativeValue();
	}

	@Override
	public License fromValueToDomain(String value) {
		return new LICENSE(value);
	}

}
