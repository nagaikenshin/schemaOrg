package org.kyojo.schemaOrg.m3n3.doma.core.musicAlbumProductionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicAlbumProductionType.REMIX_ALBUM;
import org.kyojo.schemaOrg.m3n3.core.MusicAlbumProductionType.RemixAlbum;

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
