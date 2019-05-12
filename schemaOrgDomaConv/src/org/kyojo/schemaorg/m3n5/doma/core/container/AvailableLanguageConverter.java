package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AVAILABLE_LANGUAGE;
import org.kyojo.schemaorg.m3n5.core.Container.AvailableLanguage;

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
