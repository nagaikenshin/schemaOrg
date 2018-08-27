package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ALBUM;
import org.kyojo.schemaorg.m3n4.core.Container.Album;

@ExternalDomain
public class AlbumConverter implements DomainConverter<Album, String> {

	@Override
	public String fromDomainToValue(Album domain) {
		return domain.getNativeValue();
	}

	@Override
	public Album fromValueToDomain(String value) {
		return new ALBUM(value);
	}

}
