package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_ALBUM_RELEASE_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicAlbumReleaseType;

@ExternalDomain
public class MusicAlbumReleaseTypeConverter implements DomainConverter<MusicAlbumReleaseType, String> {

	@Override
	public String fromDomainToValue(MusicAlbumReleaseType domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicAlbumReleaseType fromValueToDomain(String value) {
		return new MUSIC_ALBUM_RELEASE_TYPE(value);
	}

}
