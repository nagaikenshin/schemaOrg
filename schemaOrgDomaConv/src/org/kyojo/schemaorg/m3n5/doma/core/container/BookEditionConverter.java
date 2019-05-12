package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BOOK_EDITION;
import org.kyojo.schemaorg.m3n5.core.Container.BookEdition;

@ExternalDomain
public class BookEditionConverter implements DomainConverter<BookEdition, String> {

	@Override
	public String fromDomainToValue(BookEdition domain) {
		return domain.getNativeValue();
	}

	@Override
	public BookEdition fromValueToDomain(String value) {
		return new BOOK_EDITION(value);
	}

}
