package org.kyojo.schemaorg.m3n4.doma.core.musicAlbumProductionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.musicAlbumProductionType.DEMO_ALBUM;
import org.kyojo.schemaorg.m3n4.core.MusicAlbumProductionType.DemoAlbum;

@ExternalDomain
public class DemoAlbumConverter implements DomainConverter<DemoAlbum, String> {

	@Override
	public String fromDomainToValue(DemoAlbum domain) {
		return domain.getNativeValue();
	}

	@Override
	public DemoAlbum fromValueToDomain(String value) {
		return new DEMO_ALBUM(value);
	}

}