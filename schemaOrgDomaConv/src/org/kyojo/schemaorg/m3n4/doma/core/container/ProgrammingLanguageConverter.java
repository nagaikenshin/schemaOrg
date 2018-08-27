package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PROGRAMMING_LANGUAGE;
import org.kyojo.schemaorg.m3n4.core.Container.ProgrammingLanguage;

@ExternalDomain
public class ProgrammingLanguageConverter implements DomainConverter<ProgrammingLanguage, String> {

	@Override
	public String fromDomainToValue(ProgrammingLanguage domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProgrammingLanguage fromValueToDomain(String value) {
		return new PROGRAMMING_LANGUAGE(value);
	}

}
