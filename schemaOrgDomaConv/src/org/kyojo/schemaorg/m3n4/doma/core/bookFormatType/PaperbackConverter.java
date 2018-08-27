package org.kyojo.schemaorg.m3n4.doma.core.bookFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.bookFormatType.PAPERBACK;
import org.kyojo.schemaorg.m3n4.core.BookFormatType.Paperback;

@ExternalDomain
public class PaperbackConverter implements DomainConverter<Paperback, String> {

	@Override
	public String fromDomainToValue(Paperback domain) {
		return domain.getNativeValue();
	}

	@Override
	public Paperback fromValueToDomain(String value) {
		return new PAPERBACK(value);
	}

}
