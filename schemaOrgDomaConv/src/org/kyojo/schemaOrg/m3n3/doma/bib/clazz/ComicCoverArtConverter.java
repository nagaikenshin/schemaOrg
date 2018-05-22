package org.kyojo.schemaOrg.m3n3.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.COMIC_COVER_ART;
import org.kyojo.schemaOrg.m3n3.bib.Clazz.ComicCoverArt;

@ExternalDomain
public class ComicCoverArtConverter implements DomainConverter<ComicCoverArt, String> {

	@Override
	public String fromDomainToValue(ComicCoverArt domain) {
		return domain.getNativeValue();
	}

	@Override
	public ComicCoverArt fromValueToDomain(String value) {
		return new COMIC_COVER_ART(value);
	}

}
