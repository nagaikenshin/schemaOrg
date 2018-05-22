package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRESENTATION_DIGITAL_DOCUMENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PresentationDigitalDocument;

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
