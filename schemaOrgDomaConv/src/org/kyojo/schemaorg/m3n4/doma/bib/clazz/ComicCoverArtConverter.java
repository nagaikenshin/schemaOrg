package org.kyojo.schemaorg.m3n4.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.bib.impl.COMIC_COVER_ART;
import org.kyojo.schemaorg.m3n4.bib.Clazz.ComicCoverArt;

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
