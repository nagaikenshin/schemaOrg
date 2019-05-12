package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.EDUCATION_REQUIREMENTS;
import org.kyojo.schemaorg.m3n5.pending.Container.EducationRequirements;

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
