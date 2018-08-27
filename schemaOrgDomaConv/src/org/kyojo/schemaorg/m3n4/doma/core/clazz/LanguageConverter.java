package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LANGUAGE;
import org.kyojo.schemaorg.m3n4.core.Clazz.Language;

@ExternalDomain
public class LanguageConverter implements DomainConverter<Language, String> {

	@Override
	public String fromDomainToValue(Language domain) {
		return domain.getNativeValue();
	}

	@Override
	public Language fromValueToDomain(String value) {
		return new LANGUAGE(value);
	}

}
