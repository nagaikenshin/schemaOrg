package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRANSLATOR;
import org.kyojo.schemaOrg.m3n3.core.Container.Translator;

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
