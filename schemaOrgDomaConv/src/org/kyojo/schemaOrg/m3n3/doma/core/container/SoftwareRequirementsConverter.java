package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SOFTWARE_REQUIREMENTS;
import org.kyojo.schemaOrg.m3n3.core.Container.SoftwareRequirements;

@ExternalDomain
public class SoftwareRequirementsConverter implements DomainConverter<SoftwareRequirements, String> {

	@Override
	public String fromDomainToValue(SoftwareRequirements domain) {
		return domain.getNativeValue();
	}

	@Override
	public SoftwareRequirements fromValueToDomain(String value) {
		return new SOFTWARE_REQUIREMENTS(value);
	}

}
