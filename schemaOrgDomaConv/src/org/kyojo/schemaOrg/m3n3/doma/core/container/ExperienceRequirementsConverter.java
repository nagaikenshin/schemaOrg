package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EXPERIENCE_REQUIREMENTS;
import org.kyojo.schemaOrg.m3n3.core.Container.ExperienceRequirements;

@ExternalDomain
public class ExperienceRequirementsConverter implements DomainConverter<ExperienceRequirements, String> {

	@Override
	public String fromDomainToValue(ExperienceRequirements domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExperienceRequirements fromValueToDomain(String value) {
		return new EXPERIENCE_REQUIREMENTS(value);
	}

}
