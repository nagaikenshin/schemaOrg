package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FILM_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.FilmAction;

@ExternalDomain
public class FilmActionConverter implements DomainConverter<FilmAction, String> {

	@Override
	public String fromDomainToValue(FilmAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public FilmAction fromValueToDomain(String value) {
		return new FILM_ACTION(value);
	}

}
