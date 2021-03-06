package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MOVIE_SERIES;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieSeries;

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
