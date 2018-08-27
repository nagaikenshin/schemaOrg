package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BOOK_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookStore;

@ExternalDomain
public class BookStoreConverter implements DomainConverter<BookStore, String> {

	@Override
	public String fromDomainToValue(BookStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public BookStore fromValueToDomain(String value) {
		return new BOOK_STORE(value);
	}

}
