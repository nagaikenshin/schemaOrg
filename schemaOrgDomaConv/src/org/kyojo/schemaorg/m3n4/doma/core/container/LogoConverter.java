package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LOGO;
import org.kyojo.schemaorg.m3n4.core.Container.Logo;

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
