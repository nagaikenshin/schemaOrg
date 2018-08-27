package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SOFTWARE_HELP;
import org.kyojo.schemaorg.m3n4.core.Container.SoftwareHelp;

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
