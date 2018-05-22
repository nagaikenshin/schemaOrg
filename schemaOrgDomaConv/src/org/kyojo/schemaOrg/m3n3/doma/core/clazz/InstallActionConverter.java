package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INSTALL_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.InstallAction;

@ExternalDomain
public class InstallActionConverter implements DomainConverter<InstallAction, String> {

	@Override
	public String fromDomainToValue(InstallAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public InstallAction fromValueToDomain(String value) {
		return new INSTALL_ACTION(value);
	}

}
