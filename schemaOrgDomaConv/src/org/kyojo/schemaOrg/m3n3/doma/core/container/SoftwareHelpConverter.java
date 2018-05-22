package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SOFTWARE_HELP;
import org.kyojo.schemaOrg.m3n3.core.Container.SoftwareHelp;

@ExternalDomain
public class SoftwareHelpConverter implements DomainConverter<SoftwareHelp, String> {

	@Override
	public String fromDomainToValue(SoftwareHelp domain) {
		return domain.getNativeValue();
	}

	@Override
	public SoftwareHelp fromValueToDomain(String value) {
		return new SOFTWARE_HELP(value);
	}

}
