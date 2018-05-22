package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BROWSER_REQUIREMENTS;
import org.kyojo.schemaOrg.m3n3.core.Container.BrowserRequirements;

@ExternalDomain
public class BrowserRequirementsConverter implements DomainConverter<BrowserRequirements, String> {

	@Override
	public String fromDomainToValue(BrowserRequirements domain) {
		return domain.getNativeValue();
	}

	@Override
	public BrowserRequirements fromValueToDomain(String value) {
		return new BROWSER_REQUIREMENTS(value);
	}

}
