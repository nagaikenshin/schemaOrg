package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MUSIC_ALBUM;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MusicAlbum;

@ExternalDomain
public class MusicAlbumConverter implements DomainConverter<MusicAlbum, String> {

	@Override
	public String fromDomainToValue(MusicAlbum domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicAlbum fromValueToDomain(String value) {
		return new MUSIC_ALBUM(value);
	}

}
