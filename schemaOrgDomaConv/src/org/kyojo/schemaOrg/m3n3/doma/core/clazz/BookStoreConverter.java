package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BOOK_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BookStore;

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
