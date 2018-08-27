package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DIGITAL_DOCUMENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.DigitalDocument;

@ExternalDomain
public class DigitalDocumentConverter implements DomainConverter<DigitalDocument, String> {

	@Override
	public String fromDomainToValue(DigitalDocument domain) {
		return domain.getNativeValue();
	}

	@Override
	public DigitalDocument fromValueToDomain(String value) {
		return new DIGITAL_DOCUMENT(value);
	}

}
