package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FILM_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.FilmAction;

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
