package org.kyojo.schemaorg.m3n5.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.bib.impl.TRANSLATION_OF_WORK;
import org.kyojo.schemaorg.m3n5.bib.Container.TranslationOfWork;

@ExternalDomain
public class TranslationOfWorkConverter implements DomainConverter<TranslationOfWork, String> {

	@Override
	public String fromDomainToValue(TranslationOfWork domain) {
		return domain.getNativeValue();
	}

	@Override
	public TranslationOfWork fromValueToDomain(String value) {
		return new TRANSLATION_OF_WORK(value);
	}

}
