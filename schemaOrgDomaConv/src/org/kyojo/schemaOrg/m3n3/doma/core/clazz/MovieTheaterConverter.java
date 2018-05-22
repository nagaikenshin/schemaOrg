package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOVIE_THEATER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MovieTheater;

@ExternalDomain
public class MovieTheaterConverter implements DomainConverter<MovieTheater, String> {

	@Override
	public String fromDomainToValue(MovieTheater domain) {
		return domain.getNativeValue();
	}

	@Override
	public MovieTheater fromValueToDomain(String value) {
		return new MOVIE_THEATER(value);
	}

}
