package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SKILLS;
import org.kyojo.schemaOrg.m3n3.core.Container.Skills;

@ExternalDomain
public class SkillsConverter implements DomainConverter<Skills, String> {

	@Override
	public String fromDomainToValue(Skills domain) {
		return domain.getNativeValue();
	}

	@Override
	public Skills fromValueToDomain(String value) {
		return new SKILLS(value);
	}

}
