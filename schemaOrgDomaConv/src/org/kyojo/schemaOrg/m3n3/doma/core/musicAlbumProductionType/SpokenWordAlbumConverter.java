package org.kyojo.schemaOrg.m3n3.doma.core.musicAlbumProductionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicAlbumProductionType.SPOKEN_WORD_ALBUM;
import org.kyojo.schemaOrg.m3n3.core.MusicAlbumProductionType.SpokenWordAlbum;

@ExternalDomain
public class SpokenWordAlbumConverter implements DomainConverter<SpokenWordAlbum, String> {

	@Override
	public String fromDomainToValue(SpokenWordAlbum domain) {
		return domain.getNativeValue();
	}

	@Override
	public SpokenWordAlbum fromValueToDomain(String value) {
		return new SPOKEN_WORD_ALBUM(value);
	}

}
