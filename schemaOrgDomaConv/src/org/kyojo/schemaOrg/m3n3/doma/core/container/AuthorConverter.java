package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AUTHOR;
import org.kyojo.schemaOrg.m3n3.core.Container.Author;

@ExternalDomain
public class AuthorConverter implements DomainConverter<Author, String> {

	@Override
	public String fromDomainToValue(Author domain) {
		return domain.getNativeValue();
	}

	@Override
	public Author fromValueToDomain(String value) {
		return new AUTHOR(value);
	}

}
