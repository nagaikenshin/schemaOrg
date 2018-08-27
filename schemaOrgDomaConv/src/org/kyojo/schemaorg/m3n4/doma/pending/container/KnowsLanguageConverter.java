package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.KNOWS_LANGUAGE;
import org.kyojo.schemaorg.m3n4.pending.Container.KnowsLanguage;

@ExternalDomain
public class KnowsLanguageConverter implements DomainConverter<KnowsLanguage, String> {

	@Override
	public String fromDomainToValue(KnowsLanguage domain) {
		return domain.getNativeValue();
	}

	@Override
	public KnowsLanguage fromValueToDomain(String value) {
		return new KNOWS_LANGUAGE(value);
	}

}
