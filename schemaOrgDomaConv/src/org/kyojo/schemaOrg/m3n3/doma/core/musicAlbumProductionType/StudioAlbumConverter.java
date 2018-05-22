package org.kyojo.schemaOrg.m3n3.doma.core.musicAlbumProductionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicAlbumProductionType.STUDIO_ALBUM;
import org.kyojo.schemaOrg.m3n3.core.MusicAlbumProductionType.StudioAlbum;

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
