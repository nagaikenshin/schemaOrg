package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOVIE_RENTAL_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MovieRentalStore;

@ExternalDomain
public class MovieRentalStoreConverter implements DomainConverter<MovieRentalStore, String> {

	@Override
	public String fromDomainToValue(MovieRentalStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public MovieRentalStore fromValueToDomain(String value) {
		return new MOVIE_RENTAL_STORE(value);
	}

}
