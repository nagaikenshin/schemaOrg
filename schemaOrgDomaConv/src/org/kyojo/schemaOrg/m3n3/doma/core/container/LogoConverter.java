package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LOGO;
import org.kyojo.schemaOrg.m3n3.core.Container.Logo;

@ExternalDomain
public class LogoConverter implements DomainConverter<Logo, String> {

	@Override
	public String fromDomainToValue(Logo domain) {
		return domain.getNativeValue();
	}

	@Override
	public Logo fromValueToDomain(String value) {
		return new LOGO(value);
	}

}
