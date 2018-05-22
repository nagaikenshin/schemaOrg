package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOVIE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Movie;

@ExternalDomain
public class MovieConverter implements DomainConverter<Movie, String> {

	@Override
	public String fromDomainToValue(Movie domain) {
		return domain.getNativeValue();
	}

	@Override
	public Movie fromValueToDomain(String value) {
		return new MOVIE(value);
	}

}
