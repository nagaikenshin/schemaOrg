package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MUSIC_PLAYLIST;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MusicPlaylist;

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
