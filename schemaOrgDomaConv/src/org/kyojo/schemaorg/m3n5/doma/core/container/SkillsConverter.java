package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SKILLS;
import org.kyojo.schemaorg.m3n5.core.Container.Skills;

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