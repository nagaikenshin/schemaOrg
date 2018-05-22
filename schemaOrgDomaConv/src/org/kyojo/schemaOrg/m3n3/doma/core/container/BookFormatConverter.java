package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BOOK_FORMAT;
import org.kyojo.schemaOrg.m3n3.core.Container.BookFormat;

@ExternalDomain
public class BookFormatConverter implements DomainConverter<BookFormat, String> {

	@Override
	public String fromDomainToValue(BookFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public BookFormat fromValueToDomain(String value) {
		return new BOOK_FORMAT(value);
	}

}
