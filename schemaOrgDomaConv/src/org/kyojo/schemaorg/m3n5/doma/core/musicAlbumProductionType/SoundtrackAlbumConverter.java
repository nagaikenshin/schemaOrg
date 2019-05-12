package org.kyojo.schemaorg.m3n5.doma.core.musicAlbumProductionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.musicAlbumProductionType.SOUNDTRACK_ALBUM;
import org.kyojo.schemaorg.m3n5.core.MusicAlbumProductionType.SoundtrackAlbum;

@ExternalDomain
public class SoundtrackAlbumConverter implements DomainConverter<SoundtrackAlbum, String> {

	@Override
	public String fromDomainToValue(SoundtrackAlbum domain) {
		return domain.getNativeValue();
	}

	@Override
	public SoundtrackAlbum fromValueToDomain(String value) {
		return new SOUNDTRACK_ALBUM(value);
	}

}
