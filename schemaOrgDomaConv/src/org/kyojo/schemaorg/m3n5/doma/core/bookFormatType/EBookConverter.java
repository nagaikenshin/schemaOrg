package org.kyojo.schemaorg.m3n5.doma.core.bookFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.bookFormatType.E_BOOK;
import org.kyojo.schemaorg.m3n5.core.BookFormatType.EBook;

@ExternalDomain
public class EBookConverter implements DomainConverter<EBook, String> {

	@Override
	public String fromDomainToValue(EBook domain) {
		return domain.getNativeValue();
	}

	@Override
	public EBook fromValueToDomain(String value) {
		return new E_BOOK(value);
	}

}
