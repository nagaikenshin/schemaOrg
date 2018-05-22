package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOVIE_SERIES;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MovieSeries;

@ExternalDomain
public class MovieSeriesConverter implements DomainConverter<MovieSeries, String> {

	@Override
	public String fromDomainToValue(MovieSeries domain) {
		return domain.getNativeValue();
	}

	@Override
	public MovieSeries fromValueToDomain(String value) {
		return new MOVIE_SERIES(value);
	}

}
