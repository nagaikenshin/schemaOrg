package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SPREADSHEET_DIGITAL_DOCUMENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.SpreadsheetDigitalDocument;

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