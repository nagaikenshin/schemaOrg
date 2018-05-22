package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DIGITAL_DOCUMENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DigitalDocument;

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
