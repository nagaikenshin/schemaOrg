package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPREADSHEET_DIGITAL_DOCUMENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SpreadsheetDigitalDocument;

@ExternalDomain
public class SpreadsheetDigitalDocumentConverter implements DomainConverter<SpreadsheetDigitalDocument, String> {

	@Override
	public String fromDomainToValue(SpreadsheetDigitalDocument domain) {
		return domain.getNativeValue();
	}

	@Override
	public SpreadsheetDigitalDocument fromValueToDomain(String value) {
		return new SPREADSHEET_DIGITAL_DOCUMENT(value);
	}

}
