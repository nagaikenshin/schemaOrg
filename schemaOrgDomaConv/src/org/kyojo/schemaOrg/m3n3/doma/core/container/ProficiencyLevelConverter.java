package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROFICIENCY_LEVEL;
import org.kyojo.schemaOrg.m3n3.core.Container.ProficiencyLevel;

@ExternalDomain
public class ProficiencyLevelConverter implements DomainConverter<ProficiencyLevel, String> {

	@Override
	public String fromDomainToValue(ProficiencyLevel domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProficiencyLevel fromValueToDomain(String value) {
		return new PROFICIENCY_LEVEL(value);
	}

}
