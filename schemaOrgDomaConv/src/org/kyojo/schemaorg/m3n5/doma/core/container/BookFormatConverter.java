package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BOOK_FORMAT;
import org.kyojo.schemaorg.m3n5.core.Container.BookFormat;

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