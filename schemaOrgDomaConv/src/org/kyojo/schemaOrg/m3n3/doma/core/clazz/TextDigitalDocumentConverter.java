package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TEXT_DIGITAL_DOCUMENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TextDigitalDocument;

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
