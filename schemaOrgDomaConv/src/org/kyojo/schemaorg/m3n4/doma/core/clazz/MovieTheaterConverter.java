package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MOVIE_THEATER;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieTheater;

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
