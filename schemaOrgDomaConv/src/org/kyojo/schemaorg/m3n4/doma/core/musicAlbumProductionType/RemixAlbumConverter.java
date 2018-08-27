package org.kyojo.schemaorg.m3n4.doma.core.musicAlbumProductionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.musicAlbumProductionType.REMIX_ALBUM;
import org.kyojo.schemaorg.m3n4.core.MusicAlbumProductionType.RemixAlbum;

@ExternalDomain
public class RemixAlbumConverter implements DomainConverter<RemixAlbum, String> {

	@Override
	public String fromDomainToValue(RemixAlbum domain) {
		return domain.getNativeValue();
	}

	@Override
	public RemixAlbum fromValueToDomain(String value) {
		return new REMIX_ALBUM(value);
	}

}
