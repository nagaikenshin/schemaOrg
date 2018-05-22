package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INSTALL_URL;
import org.kyojo.schemaOrg.m3n3.core.Container.InstallUrl;

@ExternalDomain
public class InstallUrlConverter implements DomainConverter<InstallUrl, String> {

	@Override
	public String fromDomainToValue(InstallUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public InstallUrl fromValueToDomain(String value) {
		return new INSTALL_URL(value);
	}

}
