package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_ALBUM_PRODUCTION_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicAlbumProductionType;

@ExternalDomain
public class MusicAlbumProductionTypeConverter implements DomainConverter<MusicAlbumProductionType, String> {

	@Override
	public String fromDomainToValue(MusicAlbumProductionType domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicAlbumProductionType fromValueToDomain(String value) {
		return new MUSIC_ALBUM_PRODUCTION_TYPE(value);
	}

}
