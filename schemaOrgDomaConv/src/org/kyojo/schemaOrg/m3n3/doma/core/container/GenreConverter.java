package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GENRE;
import org.kyojo.schemaOrg.m3n3.core.Container.Genre;

@ExternalDomain
public class GenreConverter implements DomainConverter<Genre, String> {

	@Override
	public String fromDomainToValue(Genre domain) {
		return domain.getNativeValue();
	}

	@Override
	public Genre fromValueToDomain(String value) {
		return new GENRE(value);
	}

}
