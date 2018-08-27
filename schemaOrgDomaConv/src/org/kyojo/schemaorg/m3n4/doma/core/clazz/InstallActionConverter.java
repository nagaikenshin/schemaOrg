package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INSTALL_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.InstallAction;

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