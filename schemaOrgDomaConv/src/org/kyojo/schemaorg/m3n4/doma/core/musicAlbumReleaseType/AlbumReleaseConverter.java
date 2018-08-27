package org.kyojo.schemaorg.m3n4.doma.core.musicAlbumReleaseType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.musicAlbumReleaseType.ALBUM_RELEASE;
import org.kyojo.schemaorg.m3n4.core.MusicAlbumReleaseType.AlbumRelease;

@ExternalDomain
public class AlbumReleaseConverter implements DomainConverter<AlbumRelease, String> {

	@Override
	public String fromDomainToValue(AlbumRelease domain) {
		return domain.getNativeValue();
	}

	@Override
	public AlbumRelease fromValueToDomain(String value) {
		return new ALBUM_RELEASE(value);
	}

}
