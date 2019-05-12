package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NOTE_DIGITAL_DOCUMENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.NoteDigitalDocument;

@ExternalDomain
public class NoteDigitalDocumentConverter implements DomainConverter<NoteDigitalDocument, String> {

	@Override
	public String fromDomainToValue(NoteDigitalDocument domain) {
		return domain.getNativeValue();
	}

	@Override
	public NoteDigitalDocument fromValueToDomain(String value) {
		return new NOTE_DIGITAL_DOCUMENT(value);
	}

}
