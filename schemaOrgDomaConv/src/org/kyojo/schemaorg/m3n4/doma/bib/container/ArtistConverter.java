package org.kyojo.schemaorg.m3n4.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.bib.impl.ARTIST;
import org.kyojo.schemaorg.m3n4.bib.Container.Artist;

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
