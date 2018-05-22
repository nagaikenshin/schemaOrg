package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IN_LANGUAGE;
import org.kyojo.schemaOrg.m3n3.core.Container.InLanguage;

@ExternalDomain
public class InLanguageConverter implements DomainConverter<InLanguage, String> {

	@Override
	public String fromDomainToValue(InLanguage domain) {
		return domain.getNativeValue();
	}

	@Override
	public InLanguage fromValueToDomain(String value) {
		return new IN_LANGUAGE(value);
	}

}
