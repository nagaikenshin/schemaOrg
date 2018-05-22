package org.kyojo.schemaOrg.m3n3.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.ARTIST;
import org.kyojo.schemaOrg.m3n3.bib.Container.Artist;

@ExternalDomain
public class ArtistConverter implements DomainConverter<Artist, String> {

	@Override
	public String fromDomainToValue(Artist domain) {
		return domain.getNativeValue();
	}

	@Override
	public Artist fromValueToDomain(String value) {
		return new ARTIST(value);
	}

}
