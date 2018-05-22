package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUBTITLE_LANGUAGE;
import org.kyojo.schemaOrg.m3n3.core.Container.SubtitleLanguage;

@ExternalDomain
public class SubtitleLanguageConverter implements DomainConverter<SubtitleLanguage, String> {

	@Override
	public String fromDomainToValue(SubtitleLanguage domain) {
		return domain.getNativeValue();
	}

	@Override
	public SubtitleLanguage fromValueToDomain(String value) {
		return new SUBTITLE_LANGUAGE(value);
	}

}
