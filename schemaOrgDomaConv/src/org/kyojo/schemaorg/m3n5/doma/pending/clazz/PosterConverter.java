package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.POSTER;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Poster;

@ExternalDomain
public class PosterConverter implements DomainConverter<Poster, String> {

	@Override
	public String fromDomainToValue(Poster domain) {
		return domain.getNativeValue();
	}

	@Override
	public Poster fromValueToDomain(String value) {
		return new POSTER(value);
	}

}
