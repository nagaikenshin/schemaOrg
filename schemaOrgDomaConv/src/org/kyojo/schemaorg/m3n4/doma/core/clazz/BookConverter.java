package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BOOK;
import org.kyojo.schemaorg.m3n4.core.Clazz.Book;

@ExternalDomain
public class BookConverter implements DomainConverter<Book, String> {

	@Override
	public String fromDomainToValue(Book domain) {
		return domain.getNativeValue();
	}

	@Override
	public Book fromValueToDomain(String value) {
		return new BOOK(value);
	}

}
