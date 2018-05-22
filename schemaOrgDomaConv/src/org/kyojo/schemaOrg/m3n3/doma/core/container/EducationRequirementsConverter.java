package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EDUCATION_REQUIREMENTS;
import org.kyojo.schemaOrg.m3n3.core.Container.EducationRequirements;

@ExternalDomain
public class EducationRequirementsConverter implements DomainConverter<EducationRequirements, String> {

	@Override
	public String fromDomainToValue(EducationRequirements domain) {
		return domain.getNativeValue();
	}

	@Override
	public EducationRequirements fromValueToDomain(String value) {
		return new EDUCATION_REQUIREMENTS(value);
	}

}
