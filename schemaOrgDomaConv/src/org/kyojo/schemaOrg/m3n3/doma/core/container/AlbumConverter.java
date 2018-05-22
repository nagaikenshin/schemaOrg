package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ALBUM;
import org.kyojo.schemaOrg.m3n3.core.Container.Album;

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
