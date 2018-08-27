package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HOW_TO_SECTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToSection;

@ExternalDomain
public class HowToSectionConverter implements DomainConverter<HowToSection, String> {

	@Override
	public String fromDomainToValue(HowToSection domain) {
		return domain.getNativeValue();
	}

	@Override
	public HowToSection fromValueToDomain(String value) {
		return new HOW_TO_SECTION(value);
	}

}
