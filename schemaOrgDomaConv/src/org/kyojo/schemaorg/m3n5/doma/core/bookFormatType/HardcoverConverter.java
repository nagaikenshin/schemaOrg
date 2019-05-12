package org.kyojo.schemaorg.m3n5.doma.core.bookFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.bookFormatType.HARDCOVER;
import org.kyojo.schemaorg.m3n5.core.BookFormatType.Hardcover;

@ExternalDomain
public class HardcoverConverter implements DomainConverter<Hardcover, String> {

	@Override
	public String fromDomainToValue(Hardcover domain) {
		return domain.getNativeValue();
	}

	@Override
	public Hardcover fromValueToDomain(String value) {
		return new HARDCOVER(value);
	}

}