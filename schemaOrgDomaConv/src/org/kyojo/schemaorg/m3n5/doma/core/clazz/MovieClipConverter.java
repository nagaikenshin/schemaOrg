package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MOVIE_CLIP;
import org.kyojo.schemaorg.m3n5.core.Clazz.MovieClip;

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
