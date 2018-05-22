package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BOOK_SERIES;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BookSeries;

@ExternalDomain
public class BookSeriesConverter implements DomainConverter<BookSeries, String> {

	@Override
	public String fromDomainToValue(BookSeries domain) {
		return domain.getNativeValue();
	}

	@Override
	public BookSeries fromValueToDomain(String value) {
		return new BOOK_SERIES(value);
	}

}
