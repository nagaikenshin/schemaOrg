package org.kyojo.schemaOrg.m3n3.doma.core.musicAlbumProductionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicAlbumProductionType.LIVE_ALBUM;
import org.kyojo.schemaOrg.m3n3.core.MusicAlbumProductionType.LiveAlbum;

@ExternalDomain
public class LiveAlbumConverter implements DomainConverter<LiveAlbum, String> {

	@Override
	public String fromDomainToValue(LiveAlbum domain) {
		return domain.getNativeValue();
	}

	@Override
	public LiveAlbum fromValueToDomain(String value) {
		return new LIVE_ALBUM(value);
	}

}
