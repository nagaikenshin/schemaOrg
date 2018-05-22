package org.kyojo.schemaOrg.m3n3.doma.core.musicAlbumProductionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicAlbumProductionType.DJ_MIX_ALBUM;
import org.kyojo.schemaOrg.m3n3.core.MusicAlbumProductionType.DJMixAlbum;

@ExternalDomain
public class DJMixAlbumConverter implements DomainConverter<DJMixAlbum, String> {

	@Override
	public String fromDomainToValue(DJMixAlbum domain) {
		return domain.getNativeValue();
	}

	@Override
	public DJMixAlbum fromValueToDomain(String value) {
		return new DJ_MIX_ALBUM(value);
	}

}
