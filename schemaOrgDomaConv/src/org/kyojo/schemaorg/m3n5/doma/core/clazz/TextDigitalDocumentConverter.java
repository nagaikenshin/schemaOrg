package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TEXT_DIGITAL_DOCUMENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.TextDigitalDocument;

@ExternalDomain
public class TextDigitalDocumentConverter implements DomainConverter<TextDigitalDocument, String> {

	@Override
	public String fromDomainToValue(TextDigitalDocument domain) {
		return domain.getNativeValue();
	}

	@Override
	public TextDigitalDocument fromValueToDomain(String value) {
		return new TEXT_DIGITAL_DOCUMENT(value);
	}

}
