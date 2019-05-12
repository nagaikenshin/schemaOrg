package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ISBN;
import org.kyojo.schemaorg.m3n5.core.Container.Isbn;

@ExternalDomain
public class IsbnConverter implements DomainConverter<Isbn, String> {

	@Override
	public String fromDomainToValue(Isbn domain) {
		return domain.getNativeValue();
	}

	@Override
	public Isbn fromValueToDomain(String value) {
		return new ISBN(value);
	}

}
