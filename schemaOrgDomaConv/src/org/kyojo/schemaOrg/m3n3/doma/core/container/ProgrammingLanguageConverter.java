package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROGRAMMING_LANGUAGE;
import org.kyojo.schemaOrg.m3n3.core.Container.ProgrammingLanguage;

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
