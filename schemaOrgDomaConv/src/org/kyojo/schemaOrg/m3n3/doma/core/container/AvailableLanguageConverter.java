package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AVAILABLE_LANGUAGE;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailableLanguage;

@ExternalDomain
public class AvailableLanguageConverter implements DomainConverter<AvailableLanguage, String> {

	@Override
	public String fromDomainToValue(AvailableLanguage domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailableLanguage fromValueToDomain(String value) {
		return new AVAILABLE_LANGUAGE(value);
	}

}
