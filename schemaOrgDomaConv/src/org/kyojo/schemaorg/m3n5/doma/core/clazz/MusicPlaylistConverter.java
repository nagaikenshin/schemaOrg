package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_PLAYLIST;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicPlaylist;

@ExternalDomain
public class MusicPlaylistConverter implements DomainConverter<MusicPlaylist, String> {

	@Override
	public String fromDomainToValue(MusicPlaylist domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicPlaylist fromValueToDomain(String value) {
		return new MUSIC_PLAYLIST(value);
	}

}
