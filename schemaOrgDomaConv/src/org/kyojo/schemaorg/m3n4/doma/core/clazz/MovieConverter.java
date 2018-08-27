package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MOVIE;
import org.kyojo.schemaorg.m3n4.core.Clazz.Movie;

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