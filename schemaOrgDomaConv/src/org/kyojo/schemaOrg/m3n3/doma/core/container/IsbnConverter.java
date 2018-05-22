package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ISBN;
import org.kyojo.schemaOrg.m3n3.core.Container.Isbn;

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
