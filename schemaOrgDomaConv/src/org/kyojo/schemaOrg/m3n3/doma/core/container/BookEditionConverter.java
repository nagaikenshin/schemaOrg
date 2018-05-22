package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BOOK_EDITION;
import org.kyojo.schemaOrg.m3n3.core.Container.BookEdition;

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
