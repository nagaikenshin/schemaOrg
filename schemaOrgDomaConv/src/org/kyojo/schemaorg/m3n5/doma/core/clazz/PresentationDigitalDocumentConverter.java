package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PRESENTATION_DIGITAL_DOCUMENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.PresentationDigitalDocument;

@ExternalDomain
public class PresentationDigitalDocumentConverter implements DomainConverter<PresentationDigitalDocument, String> {

	@Override
	public String fromDomainToValue(PresentationDigitalDocument domain) {
		return domain.getNativeValue();
	}

	@Override
	public PresentationDigitalDocument fromValueToDomain(String value) {
		return new PRESENTATION_DIGITAL_DOCUMENT(value);
	}

}
