package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BOOK_FORMAT_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BookFormatType;

@ExternalDomain
public class BookFormatTypeConverter implements DomainConverter<BookFormatType, String> {

	@Override
	public String fromDomainToValue(BookFormatType domain) {
		return domain.getNativeValue();
	}

	@Override
	public BookFormatType fromValueToDomain(String value) {
		return new BOOK_FORMAT_TYPE(value);
	}

}
