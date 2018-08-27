package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TRANSLATOR;
import org.kyojo.schemaorg.m3n4.core.Container.Translator;

@ExternalDomain
public class TranslatorConverter implements DomainConverter<Translator, String> {

	@Override
	public String fromDomainToValue(Translator domain) {
		return domain.getNativeValue();
	}

	@Override
	public Translator fromValueToDomain(String value) {
		return new TRANSLATOR(value);
	}

}