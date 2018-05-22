package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOVIE_CLIP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MovieClip;

@ExternalDomain
public class MovieClipConverter implements DomainConverter<MovieClip, String> {

	@Override
	public String fromDomainToValue(MovieClip domain) {
		return domain.getNativeValue();
	}

	@Override
	public MovieClip fromValueToDomain(String value) {
		return new MOVIE_CLIP(value);
	}

}
