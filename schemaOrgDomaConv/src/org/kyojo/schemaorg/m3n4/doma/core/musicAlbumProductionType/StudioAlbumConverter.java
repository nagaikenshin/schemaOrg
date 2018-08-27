package org.kyojo.schemaorg.m3n4.doma.core.musicAlbumProductionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.musicAlbumProductionType.STUDIO_ALBUM;
import org.kyojo.schemaorg.m3n4.core.MusicAlbumProductionType.StudioAlbum;

@ExternalDomain
public class StudioAlbumConverter implements DomainConverter<StudioAlbum, String> {

	@Override
	public String fromDomainToValue(StudioAlbum domain) {
		return domain.getNativeValue();
	}

	@Override
	public StudioAlbum fromValueToDomain(String value) {
		return new STUDIO_ALBUM(value);
	}

}
