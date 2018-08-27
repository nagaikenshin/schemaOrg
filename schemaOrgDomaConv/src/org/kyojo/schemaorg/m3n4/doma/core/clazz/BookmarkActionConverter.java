package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BOOKMARK_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookmarkAction;

@ExternalDomain
public class BookmarkActionConverter implements DomainConverter<BookmarkAction, String> {

	@Override
	public String fromDomainToValue(BookmarkAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public BookmarkAction fromValueToDomain(String value) {
		return new BOOKMARK_ACTION(value);
	}

}
