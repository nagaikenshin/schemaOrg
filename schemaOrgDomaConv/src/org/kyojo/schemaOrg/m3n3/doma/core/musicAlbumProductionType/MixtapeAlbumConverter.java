package org.kyojo.schemaOrg.m3n3.doma.core.musicAlbumProductionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicAlbumProductionType.MIXTAPE_ALBUM;
import org.kyojo.schemaOrg.m3n3.core.MusicAlbumProductionType.MixtapeAlbum;

@ExternalDomain
public class MixtapeAlbumConverter implements DomainConverter<MixtapeAlbum, String> {

	@Override
	public String fromDomainToValue(MixtapeAlbum domain) {
		return domain.getNativeValue();
	}

	@Override
	public MixtapeAlbum fromValueToDomain(String value) {
		return new MIXTAPE_ALBUM(value);
	}

}
