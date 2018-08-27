package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.SKILLS;
import org.kyojo.schemaorg.m3n4.pending.Container.Skills;

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
